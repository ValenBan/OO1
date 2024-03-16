package ar.edu.unlp.objetos.uno.ejercicio5.ejercicio5;

import java.util.Date;

public class Mamifero {
	private String  id;
	private String especie;
	private Date fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {
	
	}
	
	public Mamifero(String id){
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Mamifero getPadre() {
		if(padre != null)
		return padre;
		else return null;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		if(madre != null)
		return madre;
		else return null;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.madre != null)
		return this.madre.getPadre();
		else return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.madre != null)
		return this.madre.getMadre();
		else return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.padre != null)
		return this.padre.getPadre();
		else return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.padre != null)
		return this.padre.getMadre();
		else return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero ancestro) {
		boolean encontrado = false;
		
		if(this.madre != null) {			
			if(this.madre == ancestro) encontrado =  true;
			else encontrado = madre.tieneComoAncestroA(ancestro);
		}
		
		if(encontrado == false) {
			if(this.padre != null) {
				if(this.padre == ancestro) encontrado = true;
				else encontrado = padre.tieneComoAncestroA(ancestro);
			}
		}
		
		return encontrado;
	}
}
