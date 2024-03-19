package ar.edu.unlp.objetos.uno.ejercicio14.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DataLapseTest {
	
	private DateLapse lapso;
	private DateLapse lapso2;
	private DateLapse lapso3;
	private LocalDate other;
	private LocalDate other2;

	@BeforeEach
	void setUp() throws Exception {
		this.lapso = new DateLapse (LocalDate.of(2022, 10, 5), LocalDate.of(2022, 10, 15));
		this.lapso2 = new DateLapse (LocalDate.of(2022, 10, 5), LocalDate.of(2022, 10, 5));
		this.lapso3 = new DateLapse (LocalDate.of(2022, 10, 15), LocalDate.of(2022, 10, 5));
		this.other = LocalDate.of(2022,10, 7);
		this.other2 = LocalDate.of(2022,10, 3);
	}


	@Test
	void testSizeInDays() {
		assertEquals(10,this.lapso.sizeInDays());
		assertEquals(0,this.lapso2.sizeInDays());
		assertEquals(-10,this.lapso3.sizeInDays());
	}
	
	@Test
	void testIncludesDate() {
		assertTrue(this.lapso.includesDate(other));
		assertFalse(this.lapso.includesDate(other2));
		assertFalse(this.lapso2.includesDate(other));
		assertFalse(this.lapso3.includesDate(other));
	}
	
}