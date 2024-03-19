package ar.edu.unlp.objetos.uno.ejercicio13.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	List<Carpeta> carpetas;
	Carpeta inbox;
	
	public ClienteDeCorreo(Carpeta inbox) {
		carpetas = new ArrayList<Carpeta>();
		this.inbox = inbox;
	}
	
	public void recibir(Email email) {
		inbox.agregarCorreo(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarCorreo(email);
		destino.agregarCorreo(email);
	}
	
	public Email buscar(String texto){
		if (this.inbox.buscar(texto) != null){
			return this.inbox.buscar(texto);
		}
		return this.carpetas
				.stream()
				.map(carpeta -> carpeta.buscar(texto))
				.filter(email -> email != null)
				.findFirst().orElse(null);
	}
	
	public void agregarCarpeta(Carpeta ca) {
		carpetas.add(ca);
	}
	
	
	public Carpeta getInbox() {
		return inbox;
	}
	
	public double espacioOcupado() {
		return (inbox.espacioOcupado()) + this.carpetas
				   .stream().mapToDouble(carpeta -> carpeta.espacioOcupado()).sum();
	}
}
