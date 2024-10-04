package Test;

import Clases.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestInversor {
	private Inversor sujeto;
	private Inversion accion1;
	private Inversion accion2;
	private Inversion PFijo;
	
	
	@BeforeEach
	public void setUp() {
		LocalDate fecha = LocalDate.of(2024, 10, 3);		//modificar fecha. Se podria hacer mas facil con calendar
		sujeto = new Inversor("Luca");
		accion1 = new InversionEnAcciones("manolito",5,10);	//50
		accion2 = new InversionEnAcciones("Sony",10,50);	//500
		PFijo = new PlazoFijo(100,1,fecha);	//100 --> 110
		sujeto.addInversion(PFijo);
		sujeto.addInversion(accion1);
		sujeto.addInversion(accion2);
	}
	
	@Test
	public void testValores() {
		assertEquals(sujeto.getNombre(),"Luca");
		
		assertEquals(accion1.valorActual(),50);
		assertEquals(accion2.valorActual(),500);
		
		assertEquals(PFijo.valorActual(),101);
		
		assertEquals(sujeto.valorActual(), 651);
	}
	
	
	
	
	
	
	
	
	
	
	
}
