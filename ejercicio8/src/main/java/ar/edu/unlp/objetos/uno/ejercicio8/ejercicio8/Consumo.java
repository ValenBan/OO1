package ar.edu.unlp.objetos.uno.ejercicio8.ejercicio8;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		fecha = LocalDate.now();
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public double costoEnBase(double precioKWh) {
		return precioKWh * consumoEnergiaActiva;
		
	}
	
	public double factorDePotencia() {
		return ((consumoEnergiaActiva)/(Math.sqrt((Math.pow(consumoEnergiaActiva, 2)) + Math.pow(consumoEnergiaReactiva, 2))));
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public void setConsumoEnergiaActiva(double consumoEnergiaActiva) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public void setConsumoEnergiaReactiva(double consumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	
}
