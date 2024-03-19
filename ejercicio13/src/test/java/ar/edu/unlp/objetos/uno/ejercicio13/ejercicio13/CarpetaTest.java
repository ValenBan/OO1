package ar.edu.unlp.objetos.uno.ejercicio13.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	private Carpeta carpetaConEmails;
	private Carpeta carpetaSinEmails;
	private Email email;
	private Email email2;

	@BeforeEach
	void setUp() throws Exception {
		this.carpetaConEmails = new Carpeta("TengoMails");
		this.carpetaSinEmails = new Carpeta("NoTengoMails");
		this.email= new Email ("SoyUnMail","12345Hola");
		this.email2= new Email ("Soy","12");
	}
	
	@Test
	public void ContieneBien() {
		this.carpetaConEmails = new Carpeta("TengoMails");
		carpetaConEmails.agregarCorreo(email);
		carpetaConEmails.agregarCorreo(email2);
		
		assertNotNull(carpetaConEmails.buscar("45Ho"));
	}
	
	@Test
	public void ContieneMal() {
		this.carpetaConEmails = new Carpeta("TengoMails");
		carpetaConEmails.agregarCorreo(email);
		carpetaConEmails.agregarCorreo(email2);
		
		assertNull(carpetaConEmails.buscar("45Hos"));
	}
	
	@Test
	public void tamaño() {
		this.carpetaConEmails = new Carpeta("TengoMails");
		carpetaConEmails.agregarCorreo(email);
		carpetaConEmails.agregarCorreo(email2);
		
		assertEquals(23,carpetaConEmails.espacioOcupado());
	}
}
