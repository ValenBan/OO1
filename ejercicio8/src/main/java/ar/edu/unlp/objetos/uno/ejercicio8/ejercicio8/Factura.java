package ar.edu.unlp.objetos.uno.ejercicio8.ejercicio8;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	
	public Factura (double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.usuario = usuario;
		this.fecha = LocalDate.now();
	}
	
	public double montoTotal() {
		return this.montoEnergiaActiva - this.montoEnergiaActiva * (this.descuento / 100);
	}
	
	public Usuario usuario() {
		return usuario;
	}
	
	public LocalDate fecha() {
		return fecha;
	}
	
	public double descuento() {
		return descuento;
	}
}
