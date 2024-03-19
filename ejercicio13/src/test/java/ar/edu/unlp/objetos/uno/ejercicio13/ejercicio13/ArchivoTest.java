package ar.edu.unlp.objetos.uno.ejercicio13.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
	
	private Archivo archivo;
	
	@BeforeEach
	public void setUp() {
		archivo = new Archivo("Batman");
	}
	
	@Test
	public void testTamaño() {
		assertEquals(6, archivo.tamaño());
	}
}
