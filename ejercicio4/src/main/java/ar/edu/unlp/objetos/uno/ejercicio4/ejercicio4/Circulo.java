package ar.edu.unlp.objetos.uno.ejercicio4.ejercicio4;

public class Circulo implements Figura{
	public double diametro;
	public double radio;
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		radio = diametro / 2;
		
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
		diametro = radio * 2;
	}
	@Override
	public double getPerimetro() {
		return Math.PI * getDiametro(); 
	}
	@Override
	public double getArea() {
		return Math.PI * (Math.pow(radio, 2));
	}
	
	
	
}
