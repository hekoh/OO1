package Test;

import Clases.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCliente {
	private Cliente clien;
	private Cliente empre;
	private Envio E1;
	private Envio E2;
	private Envio E3;
	private Envio E4;
	private Pais arg;
	private Pais br;
	private CuadroTarifario cuadro;
	
	
	@BeforeEach
	public void setup() {
		arg = new Pais("Argentina");
		br = new Pais("Brasil");
		clien = new Persona("Luca","calle 11 111", 111111,arg);
		empre = new Empresa("UNLP","Calle 50 555", 546666,br);
		cuadro = new CuadroTarifario();
		cuadro.agregarPais(arg);
		cuadro.modificarCosto(arg, 5000);
		cuadro.agregarPais(br);
		cuadro.modificarCosto(br, 3500);
		E1 = new Locales(true,"calle-10 1010","calle-55 777",LocalDate.of(2024, 10, 20), 500.0); //1500
		E2 = new Interurbanos(50,"Talcahuano 123", "calle-7 552",LocalDate.of(2024, 10, 25), 400.0);	//4000
		E3 = new Interurbanos(250,"segurola 342", "havana 520",LocalDate.of(2024, 10, 25), 500.0);//15000
		E4 = new Internacionales("bossa 250","Diagonal-78 853",LocalDate.of(2024, 11, 5),1000.0,arg);//15000
		clien.AgregarEnvio(E1);
		empre.AgregarEnvio(E2);
		empre.AgregarEnvio(E3);
		empre.AgregarEnvio(E4);
	}
	
	
	@Test
	public void testCosto() {
		assertEquals(clien.montoApagar(LocalDate.of(2024, 10, 19), LocalDate.now(), cuadro), 1350.0); //10% off
		assertEquals(empre.montoApagar(LocalDate.of(2024, 10, 19), LocalDate.now(), cuadro),34000.0);
	}
	
	
}
