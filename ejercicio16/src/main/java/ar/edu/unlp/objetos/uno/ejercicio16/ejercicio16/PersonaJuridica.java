package ar.edu.unlp.objetos.uno.ejercicio16.ejercicio16;

public class PersonaJuridica extends Persona{
	private String CUIT;
	private String tipo;
	private String nroTelefono;

	
	public PersonaJuridica(String nombre, String direccion, String cUIT, String tipo, String nroTelefono) {
		super(nombre, direccion, nroTelefono);
		CUIT = cUIT;
		this.tipo = tipo;
	}
}
