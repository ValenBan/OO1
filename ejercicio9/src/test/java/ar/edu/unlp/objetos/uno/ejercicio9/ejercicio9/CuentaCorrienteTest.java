package ar.edu.unlp.objetos.uno.ejercicio9.ejercicio9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CuentaCorrienteTest {
	private CuentaCorriente cuentaCorriente;
	private CuentaCorriente cuentaCorriente2;
	
	@BeforeEach
	public void setUp() {
		cuentaCorriente = new CuentaCorriente();
		cuentaCorriente2 = new CuentaCorriente();
	}
	
	@Test
	public void depositar() {
		cuentaCorriente.depositar(100);
		assertEquals(100,cuentaCorriente.getSaldo());
	}
	
	@Test
	public void extraerExitoso() {
		cuentaCorriente.depositar(100);
		assertTrue(cuentaCorriente.extraer(100));
		assertEquals(0, cuentaCorriente.getSaldo());
		
	}
	
	public void extraerFallido() {
		cuentaCorriente.depositar(100);
		cuentaCorriente.setDescubierto(10);
		assertFalse(cuentaCorriente.extraer(120));
		assertEquals(100, cuentaCorriente.getSaldo());
	}
	
	@Test
	public void transferenciaExitosa() {
		cuentaCorriente.depositar(120);
		cuentaCorriente.setDescubierto(120);
		assertTrue(cuentaCorriente.transferirACuenta(140, cuentaCorriente2));
		assertEquals(-20, cuentaCorriente.getSaldo());
		assertEquals(140, cuentaCorriente2.getSaldo());
	}
	
	@Test
	public void transferenciaFallida() {
		cuentaCorriente.depositar(120);
		cuentaCorriente.setDescubierto(120);
		assertFalse(cuentaCorriente.transferirACuenta(340, cuentaCorriente2));
		assertEquals(120, cuentaCorriente.getSaldo());
		assertEquals(0, cuentaCorriente2.getSaldo());
	}
	
}
