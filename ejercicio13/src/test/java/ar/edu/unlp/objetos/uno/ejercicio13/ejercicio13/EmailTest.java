package ar.edu.unlp.objetos.uno.ejercicio13.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	
	private Email emailConAdjuntos;
	private Email emailSinAdjuntos;
	private Archivo archivo;
	private Archivo archivo2;

	@BeforeEach
	void setUp() throws Exception {
		this.emailConAdjuntos = new Email ("SoyUnMail","12345Hola");// 18
		this.emailSinAdjuntos = new Email ("Soy","12345Hola"); //12
		this.archivo = new Archivo("LanaDelRey"); //10
		this.archivo2 = new Archivo("TaylorSwift"); //11
		
	}
	
	@Test
	public void testContieneBien() {
		assertTrue(emailConAdjuntos.contiene("12"));
	}
	@Test
	public void testContieneMal() {
		assertFalse(emailConAdjuntos.contiene("Valentin"));
	}
	@Test
	public void tamañoConAdjuntos() {
		emailConAdjuntos.agregarAdjuntos(archivo);
		emailConAdjuntos.agregarAdjuntos(archivo2);
		
		assertEquals(39, emailConAdjuntos.espacioOcupado());
	}
	
	@Test
	public void tamañoSinAdjuntos() {
		assertEquals(12, emailSinAdjuntos.espacioOcupado());

	}
	
	

}
