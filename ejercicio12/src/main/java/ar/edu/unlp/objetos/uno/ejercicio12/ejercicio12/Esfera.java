package ar.edu.unlp.objetos.uno.ejercicio12.ejercicio12;

public class Esfera extends Pieza{
	private int radio;	
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	@Override
	public double getVolumenDeMateria() {
		return ((double) 4/3) * Math.PI * Math.pow(this.getRadio(),3);
	}

	@Override
	public double getSuperficieDeColor() {
		return 4 * Math.PI * Math.pow(this.getRadio(),2);
	}



}