package ar.edu.unlp.objetos.uno.ejercicio8.ejercicio8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsumoTest {
	
	private Consumo consumo;
	private Consumo consumo2;
	
	@BeforeEach
	public void setUp() {
		consumo = new Consumo(100, 10);
		consumo2 = new Consumo(100, 100);
	}
	
	@Test
	public void aplicarDescuento() {
		assertFalse(consumo2.factorDePotencia() > 0.8);
	}
	
	@Test
	public void noAplicarDescuento() {
		assertFalse(consumo.factorDePotencia() < 0.8);		
	}
}
