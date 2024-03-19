package ar.edu.unlp.objetos.uno.ejercicio11.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {

	private Inversor inversor;
	private InversionEnAcciones inversionEnAcciones;
	
	@BeforeEach
	public void setUp() {
		inversor = new Inversor("Valentin");
		inversionEnAcciones = new InversionEnAcciones("inversion", 100, 10);
		inversor.addInversion(inversionEnAcciones);
	}
	
	@Test
	public void Inversion() {
		inversor.addInversion(new InversionEnAcciones("xd", 100, 20));
		assertEquals(3000, inversor.valorActual());
	}
}
