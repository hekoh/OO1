package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import Clases.*;

public class TestCajaDeAhorro {
	private Cuenta modelo1;
	private Cuenta modelo2;
	
	@BeforeEach
	public void setup() {
		modelo1 = new CajaDeAhorro();
		modelo2 = new CajaDeAhorro();
	}
	
	
	@Test
	public void testDep() {
		assertEquals(modelo1.getSaldo(),0);
		assertEquals(modelo2.getSaldo(),0);
		
		modelo1.depositar(500);
		modelo2.depositar(700);
		
		assertEquals(modelo1.getSaldo(),490);
		assertEquals(modelo2.getSaldo(),686);
	}
	
	@Test
	public void testTransfer() {
		modelo1.depositar(500);
		modelo2.depositar(700);
		
		assertEquals(true, modelo1.transferirACuenta(200, modelo2));
		
		assertEquals(modelo1.getSaldo(),286,0.1);
		assertEquals(modelo2.getSaldo(),886,0.1);
		
		assertEquals(modelo2.transferirACuenta(900, modelo1),false);
	}
	
	@Test
	public void testExtraer() {
		modelo1.depositar(500);
		modelo2.depositar(700);
		
		assertEquals(modelo1.extraer(500),false);
		assertEquals(modelo2.extraer(700),false);
		
		assertEquals(modelo1.extraer(400),true);
		assertEquals(modelo2.extraer(672),true);
		
	}
	
	
	
	
}












