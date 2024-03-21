package ar.edu.unlp.objetos.uno.ejercicio15.ejercicio15;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Sistema {
	private List<Usuario> usuarios;
	private List<Propiedad> propiedades;
	
	public Sistema() {
		usuarios = new ArrayList<Usuario>();
		propiedades = new ArrayList<Propiedad>();
	}
	
	public Usuario registrarUsuario(String nombre, String direccion, String dni) {
		Usuario usuarioNuevo = new Usuario(nombre, direccion, dni);
		usuarios.add(usuarioNuevo);
		return usuarioNuevo;
	}
	
	public Propiedad registrarPropiedad(String nombre, String direccion, String descripcion, double precioPorNoche) {
		Propiedad propiedadNueva = new Propiedad(nombre, direccion, descripcion, precioPorNoche);
		propiedades.add(propiedadNueva);
		return propiedadNueva;
	}
	
	public List<Propiedad> propiedadesDisponiblesEnPeriodo(LocalDate desde, LocalDate hasta){
		return propiedades.stream()
					  	   .filter(propiedad -> propiedad.propiedadDisponibleEnPeriodo(desde, hasta))
						   .collect(Collectors.toList());
	}
	
	public Reserva reservar(Propiedad propiedad, Usuario usuario, LocalDate desde, LocalDate hasta) {
		Reserva nuevaReserva = null;
		if(propiedad.propiedadDisponibleEnPeriodo(desde, hasta)) {
			nuevaReserva = new Reserva(desde, hasta, propiedad, usuario);
			usuario.agregarReserva(nuevaReserva);
			propiedad.agregarReserva(nuevaReserva);
		}
		
		return nuevaReserva;
	}
	
	public double calcularPrecio(Reserva reserva) {
		return reserva.calcularPrecio();
	}
	
	public void eliminarReserva(Reserva reserva) {
		if(reserva.fechaPosterior()) {
			reserva.getUsuario().eliminarReserva(reserva);
			reserva.getPropiedad().agregarReserva(reserva);
		}
	}
	
	public List<Reserva> obtenerReservaUsuario(Usuario usuario){
		return usuario.getReservas();
	}
	
	public double calcularIngresoPropietario (Usuario usuario,LocalDate desde, LocalDate hasta) {
		return usuario.calcularIngresoPropietario( desde, hasta);
	}
}
