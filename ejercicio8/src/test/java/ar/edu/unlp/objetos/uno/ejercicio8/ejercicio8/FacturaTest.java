package ar.edu.unlp.objetos.uno.ejercicio8.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {

	
	private Factura factura;
	private Usuario usuario;
	
	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Valentin", "San Martin 432");
		factura = new Factura(100, 10, usuario);
	}
	
	@Test
	public void testMontoTotal() {
		assertEquals(10, factura.descuento());
		assertEquals(90, factura.montoTotal());
		assertEquals(usuario, factura.usuario());
	}
	
	
}
