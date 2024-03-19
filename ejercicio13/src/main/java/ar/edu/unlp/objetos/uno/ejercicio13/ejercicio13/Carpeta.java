package ar.edu.unlp.objetos.uno.ejercicio13.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new ArrayList<Email>();
	}
	
	public List<Email> getEmails(){
		return emails;
	}
	
	public void agregarCorreo(Email email) {
		emails.add(email);
	}
	
	public void eliminarCorreo(Email email) {
		emails.remove(email);
	}
	
	public Email buscar(String texto) {
		return this.emails
				.stream()
				.filter(email -> email.contiene(texto))
				.findFirst().orElse(null);
	}
	
	public double espacioOcupado() {
		return this.emails
				   .stream()
				   .mapToDouble(email -> email.espacioOcupado()).sum();
	}
	
}
