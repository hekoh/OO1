package Test;

import Clases.*;
import Clases.Ejercicio18.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDevolucion {
	private Propiedad prop;
	private Politica estrict = new Estricta();
	private Politica flex = new Flexible();
	private Politica moder = new Moderada();
	
	
	@BeforeEach
	public void setup() {
		this.prop = new Propiedad("calle 11","ED1",50.0);
		DateLapse lapso1 = new DateLapse(LocalDate.now().plusDays(7),LocalDate.now().plusDays(10));
		this.prop.addReserva(lapso1);
		DateLapse lapso2 = new DateLapse(LocalDate.now().plusDays(2),LocalDate.now().plusDays(5));
		this.prop.addReserva(lapso2);
		DateLapse lapso3 = new DateLapse(LocalDate.now(),LocalDate.now().plusDays(1));
		this.prop.addReserva(lapso3);
		DateLapse lapso4 = new DateLapse(LocalDate.now().plusDays(10),LocalDate.now().plusDays(15));
		this.prop.addReserva(lapso4);
	}
	
	@Test
	public void testDevolucion() {
		prop.cambiarPolitica(estrict);
		assertEquals(prop.cancelarReserva(prop.getReserva(3)),0);
		prop.cambiarPolitica(moder);
		assertEquals(prop.cancelarReserva(prop.getReserva(2)),0);
		assertEquals(prop.cancelarReserva(prop.getReserva(1)),75.0);
		prop.cambiarPolitica(flex);
		assertEquals(prop.cancelarReserva(prop.getReserva(0)),150.0);
	}
	
}
