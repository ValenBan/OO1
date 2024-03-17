package ar.edu.unlp.objetos.uno.ejercicio9.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro cajaDeAhorro;
	private CuentaCorriente cuentaCorriente;
	
	 @BeforeEach
	 public void setUp() {
		 cajaDeAhorro = new CajaDeAhorro();
		 cuentaCorriente = new CuentaCorriente();
	 }
	 
	 @Test
	 public void depositar() {
		 cajaDeAhorro.depositar(100);
		 assertEquals((100 - (100*0.02)), cajaDeAhorro.getSaldo());
	 }
	 
	 @Test
	 public void extraccionExitosa() {
		 cajaDeAhorro.depositar(100);
		 double saldoDepositado = cajaDeAhorro.getSaldo();
		 boolean resultado = cajaDeAhorro.extraer(20);
		 
		 assertTrue(resultado);
		 assertEquals(saldoDepositado - (20 + (20 * 0.02)), cajaDeAhorro.getSaldo());
		 
		 
	 }
	 
	 @Test
	 public void extraccionFallida() {
		 cajaDeAhorro.depositar(100);
		 boolean resultado = cajaDeAhorro.extraer(200);
		 assertFalse(resultado);

	 }
	 
	 @Test
	 public void transferenciaAOtraCuenta() {
		 cajaDeAhorro.depositar(100);
		 
		 double saldoDepositado = cajaDeAhorro.getSaldo();
		 
		 assertTrue(cajaDeAhorro.transferirACuenta(20, cuentaCorriente));
		 
		 assertEquals(saldoDepositado - (20 + (20 * 0.02)), cajaDeAhorro.getSaldo());
		 
		 assertEquals(20*1.02, cuentaCorriente.getSaldo());
		 
	 }
	 
	 @Test
	 public void transferenciaFallida() {
		 cajaDeAhorro.depositar(100);
		 
		 double saldoDepositado = cajaDeAhorro.getSaldo();
		 
		 assertFalse(cajaDeAhorro.transferirACuenta(100, cuentaCorriente));
		 
		 assertEquals(saldoDepositado , cajaDeAhorro.getSaldo());
		 
		 assertEquals(0, cuentaCorriente.getSaldo());
	 }
}
