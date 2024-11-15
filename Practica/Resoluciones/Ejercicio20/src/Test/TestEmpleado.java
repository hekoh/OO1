package Test;

import Clases.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {
	private Empleado emple;
	private Contrato cont1;
	private Contrato cont2;
	private Contrato cont3;
	private Contrato cont4;
	
	
	@BeforeEach
	public void setup() {
		this.emple = new Empleado("Luca", "gerace", 123123, LocalDate.of(2003, 6, 5), true, true);
		this.cont1 = new Por_horas(10,120,LocalDate.now().minusYears(2),LocalDate.now());
		this.cont2 = new Por_horas(10,120,LocalDate.now().minusYears(4),LocalDate.now().minusYears(2));
		this.cont3 = new De_planta(50,100,1000,LocalDate.now());
		this.cont4 = new Por_horas(50,100,LocalDate.now().plusYears(1),LocalDate.now().plusYears(2));
		this.emple.agregarContrato(cont1);
		this.emple.agregarContrato(cont2);
		this.emple.agregarContrato(cont3);
	}
	
	
	@Test
	public void testAntiguedad() {
		assertEquals(emple.antiguedad(),1460.0,1.0);
	}
	
	@Test
	public void testSueldo() {
		assertEquals(cont1.sueldo(),1200);
		assertEquals(cont3.sueldo(),1150);
	}
	
	@Test
	public void testRecibo() {
		Recibo aux = emple.generarRecibo();
		assertEquals(aux.getMonto(),1150);
	}
}
