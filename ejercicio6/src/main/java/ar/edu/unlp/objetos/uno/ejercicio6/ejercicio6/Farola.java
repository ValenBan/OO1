package ar.edu.unlp.objetos.uno.ejercicio6.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendido;
	private List<Farola> farolasVecinas;
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		encendido = false;
		farolasVecinas = new ArrayList<Farola>();
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		farolasVecinas.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return farolasVecinas;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(!encendido) {
			encendido = true;
			for (int i = 0; i < farolasVecinas.size(); i++){
				farolasVecinas.get(i).turnOn();
			}
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(encendido) {
			encendido = false;
			for (int i = 0; i < farolasVecinas.size(); i++){
				farolasVecinas.get(i).turnOff();
			}
		}
	}



	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn(){
		return encendido;
	}

}
