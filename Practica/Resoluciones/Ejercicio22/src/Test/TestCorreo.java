package Test;

import Clases.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.HashMap;

public class TestCorreo {
	private ClienteDeCorreo cliente;
	private Carpeta importante;
	private Carpeta Spam;
	private Email mail1;
	private Email mail2;
	private Email mail3;
	private Email mail4;
	private Archivo img;
	private Archivo aux;
	private Archivo aux2;
	private Categoria cat;
	
	 @BeforeEach
	 public void setup() {
		 cliente = new ClienteDeCorreo();
		 importante = new Carpeta("importante");
		 Spam = new Carpeta("spam");
		 mail1 = new Email("Primer Mail","Bienvenido!");
		 img = new Archivo("imagen de mi viaje");
		 mail2 = new Email("ya volvi del exterior!","Fin de mis vacaciones",img);
		 aux = new Archivo("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		 aux2 = new Archivo("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		 mail3 = new Email("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111","11111111111111111111111111",aux);
		 mail3.agregarAdjunto(aux2);
		 mail4 = new Email("oferta laboral","estamos interesados en vos");
		 cliente.nuevaCarpeta(importante);
		 cliente.nuevaCarpeta(Spam);
		 cliente.recibir(mail1);
		 cliente.recibir(mail2);
		 cliente.recibir(mail3);
		 cliente.recibir(mail4);
		 cliente.getInbox().mover(mail2, importante);
		 cliente.getInbox().mover(mail3, Spam);
		 cliente.getInbox().mover(mail4, importante);
		 cat = new Categoria();
		 cat.setRangos("Pequeño", 300);
		 cat.setRangos("Mediano", 500);
		 cat.setRangos("Grande", -1);


	 }
	
	 
	 @Test
	 public void testTamanio() {
		 assertEquals(img.tamanio(),18);	
		 assertEquals(mail1.tamanio(),22);
		 //assertEquals(mail2.tamanio(),61);
		 //assertEquals(mail3.tamanio(),38);
		 //assertEquals(mail4.tamanio(),40);
		 assertEquals(importante.tamanio(),101);		 
		 assertEquals(Spam.tamanio(),432);
		 assertEquals(cliente.espacioOcupado(),555);
	 }
	 
	 @Test
	 public void testBuscar() {
		 assertEquals(cliente.buscar("Mail"),mail1);
		 assertEquals(cliente.buscar("en "),mail4);
		 assertEquals(cliente.buscar("hola"),null);
		 assertEquals(importante.buscar("es"),mail2);
		 assertEquals(Spam.buscar("ayuda"),null);
	 }
	 
	 @Test
	 public void testCantidad() {
		 assertEquals(importante.cantidad(),2);
		 assertEquals(cliente.cantidadMails(),4);
	 }
	 
	 @Test
	 public void tesBagaCarpeta() {
		 BagImpl<String> aux = cliente.catMails(cat);
		 assertEquals(aux.occurrencesOf("Pequeño"),3);
		 assertEquals(aux.occurrencesOf("Mediano"),1);
		 assertEquals(aux.occurrencesOf("Grande"),0);
	 }
	  
}
