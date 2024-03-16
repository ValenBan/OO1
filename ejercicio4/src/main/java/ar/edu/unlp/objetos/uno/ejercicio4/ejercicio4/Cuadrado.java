package ar.edu.unlp.objetos.uno.ejercicio4.ejercicio4;

public class Cuadrado implements Figura {

	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double getPerimetro() {
		return lado*4;
	}

	@Override
	public double getArea() {
		return lado*lado;
	}

}
