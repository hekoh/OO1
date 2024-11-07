package Test;

import Clases.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUsuario {
	private Usuario user;
	private Propiedad prop1;
	private Propiedad prop2;

	
	@BeforeEach
	public void setup(){
		user = new Usuario("luca","calle 11",47731485);
		prop1 = new Propiedad("ED1","calle 12",50.0);
		prop2 = new Propiedad("ED2","calle 13",75.0);
		user.addPropiedad(prop1);
		user.addPropiedad(prop2);
		DateLapse lapso1 = new DateLapse(LocalDate.of(2024, 7, 1),LocalDate.of(2024, 7, 6));
		prop1.addReserva(lapso1);
		DateLapse lapso2 = new DateLapse(LocalDate.of(2024, 6, 15),LocalDate.of(2024, 6, 30));
		prop1.addReserva(lapso2);
		DateLapse lapso3 = new DateLapse(LocalDate.of(2024, 6, 27),LocalDate.of(2024, 7, 4));
		prop2.addReserva(lapso3);
		DateLapse lapso4 = new DateLapse(LocalDate.of(2024, 6, 10),LocalDate.of(2024, 6, 15));
		prop2.addReserva(lapso4);
	}
	
	@Test
	public void testDisponible() {
		DateLapse lapso1 = new DateLapse(LocalDate.of(2024, 7, 2),LocalDate.of(2024, 7, 5));
		assertEquals(prop1.disponible(lapso1),false); 
		assertEquals(prop2.disponible(lapso1),false);
		lapso1 = new DateLapse(LocalDate.of(2024, 6, 20),LocalDate.of(2024, 6, 27));
		assertEquals(prop1.disponible(lapso1),false); 
		assertEquals(prop2.disponible(lapso1),true);
	}
	
	@Test
	public void recaudacion() {
		DateLapse lapso1 = new DateLapse(LocalDate.of(2024, 6, 1),LocalDate.of(2024, 6, 30));
		assertEquals(prop1.recaudacion(lapso1),750);
		lapso1 = new DateLapse(LocalDate.of(2024, 5, 1),LocalDate.of(2024, 7, 31));
		assertEquals(user.ingresos(lapso1),1425);
	}
	
	
	
	
	
}
