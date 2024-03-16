package ar.edu.unlp.objetos.uno.ejercicio7.ejercicio7;


public class Empleado {
	private String nombre;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	public Empleado() {
		
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 13500;
	}
	
	
	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
	
	public static void main(String[] args) {
		
		
		
		Gerente alan = new Gerente("Alan Turing");
		
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		
		double aportesDeAlan = alan.aportes();	
	}
}
