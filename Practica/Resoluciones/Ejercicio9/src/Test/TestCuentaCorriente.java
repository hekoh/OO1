package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clases.*;

public class TestCuentaCorriente {
	private CuentaCorriente modelo1;
	private CuentaCorriente modelo2;
	
	
	@BeforeEach
	public void setup() {
		modelo1 = new CuentaCorriente();
		modelo2 = new CuentaCorriente();
		modelo1.setLimite(200);
		modelo2.setLimite(500);
	}
	
	@Test
	public void testDep() {
		assertEquals(modelo1.getSaldo(),0);		//creo que esto no va aca
		assertEquals(modelo2.getSaldo(),0);
		
		modelo1.depositar(500);					//esto deberia ir en BeforeEach ?
		modelo2.depositar(700);
		
		assertEquals(modelo1.getSaldo(),500);
		assertEquals(modelo2.getSaldo(),700);
	}
	
	@Test
	public void testTransfer() {
		modelo1.depositar(500);
		modelo2.depositar(700);
		
		assertEquals(true, modelo1.transferirACuenta(500, modelo2));
		
		assertEquals(modelo1.getSaldo(),0);
		assertEquals(modelo2.getSaldo(),1200);
		
		assertEquals(modelo2.transferirACuenta(1701, modelo1),false);
	}
	
	@Test
	public void testExtraer() {
		modelo1.depositar(500);
		modelo2.depositar(700);
		
		assertEquals(modelo1.extraer(700),true);
		assertEquals(modelo2.extraer(1000),true);
		assertEquals(modelo1.extraer(1),false);
		assertEquals(modelo2.extraer(201),false);
		
		assertEquals(modelo1.getSaldo(),-200);
		assertEquals(modelo2.getSaldo(),-300);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
