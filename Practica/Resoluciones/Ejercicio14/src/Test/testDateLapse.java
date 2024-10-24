package Test;

import Clases.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testDateLapse{
	private Lapses lapso;
	private LocalDate desde;
	private LocalDate hasta;
	
	@BeforeEach
	public void setUp() {
		this.desde = LocalDate.of(2024, 10, 5);
		this.hasta = LocalDate.of(2024, 10, 10);
		this.lapso = new DateLapse(desde,hasta);
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
