package ar.edu.unlp.objetos.uno.ejercicio15.ejercicio15;

import java.time.LocalDate;
import java.util.*;

public class Propiedad {
	private String nombre;
	private String direccion;
	private String descripcion;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String direccion, String descripcion, double precioPorNoche) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.descripcion = direccion;
		this.precioPorNoche = precioPorNoche;
		reservas = new ArrayList<Reserva>();
	}
	
	public boolean propiedadDisponibleEnPeriodo(LocalDate desde, LocalDate hasta) {	
		return reservas.stream().anyMatch(reserva -> reserva.disponibleEn(desde, hasta));
	}
	
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public double getPrecioPorNoche() {
		return this.getPrecioPorNoche();
	}
	public void eliminarReserva(Reserva reserva) {
		reservas.remove(reserva);
	}
	
	public double calcularIngresoPropiedad(LocalDate desde, LocalDate hasta) {
		return this.reservas.stream().filter(reserva -> reserva.disponibleEn(desde, hasta)).mapToDouble(reserva -> reserva.calcularPrecio()).sum();
		
	}
	
	
}
