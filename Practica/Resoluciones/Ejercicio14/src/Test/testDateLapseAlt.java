package Test;

import Clases.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testDateLapseAlt{
	private Lapses lapso;
	private LocalDate desde;
	private int hasta;
	
	@BeforeEach
	public void setUp() {
		this.desde = LocalDate.of(2024, 10, 5);
		hasta = 5;
		this.lapso = new DateLapseAlt(desde,hasta);
	}
	
	@Test
	public void testTamanio() {
		assertEquals(lapso.sizeInDays(), 5);
	}
	
	@Test
	public void incluye() {
		LocalDate otro = LocalDate.of(2024, 10, 7);
		assertEquals(lapso.includesDate(otro),true);
		otro = LocalDate.of(2024, 10, 10);
		assertEquals(lapso.includesDate(otro),false);
		otro = LocalDate.of(2024, 10, 4);
		assertEquals(lapso.includesDate(otro),false);
	}
	
}
