package ar.edu.unlp.objetos.uno.ejercicio15.ejercicio15;

import java.time.LocalDate;
import java.util.*;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private String dni;
	private List<Reserva> reservas;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		
		propiedades = new ArrayList<Propiedad>();
		reservas = new ArrayList<Reserva>();
	}
	
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		reservas.remove(reserva);
	}
	
	public List<Reserva> getReservas(){
		return this.reservas;
	}
	
	public double calcularIngresoPropietario (LocalDate desde, LocalDate hasta) {
		return this.propiedades.stream().mapToDouble(propiedad -> propiedad.calcularIngresoPropiedad(desde, hasta)).sum();
	}
}
