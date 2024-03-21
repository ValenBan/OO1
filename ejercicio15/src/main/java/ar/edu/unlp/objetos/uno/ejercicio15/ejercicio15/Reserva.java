package ar.edu.unlp.objetos.uno.ejercicio15.ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	
	private LocalDate desde;
	private LocalDate hasta;
	private Propiedad propiedad;
	private Usuario usuario;
	
	public Reserva(LocalDate desde, LocalDate hasta, Propiedad propiedad, Usuario usuario) {
		this.desde = desde;
		this.hasta = hasta;
		this.propiedad = propiedad;
		this.usuario = usuario;
	}
	
	public boolean disponibleEn(LocalDate desde, LocalDate hasta) {
		return (this.desde.isBefore(desde) && this.desde.isBefore(hasta)) && (this.hasta.isAfter(desde) && this.hasta.isAfter(hasta));
	}
	
	public double calcularPrecio() {
		return this.desde.until(this.hasta,ChronoUnit.DAYS) * propiedad.getPrecioPorNoche();
	}
	
	public boolean fechaPosterior() {
		return LocalDate.now().isAfter(this.desde);
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}


	public Usuario getUsuario() {
		return usuario;
	}
	
}
