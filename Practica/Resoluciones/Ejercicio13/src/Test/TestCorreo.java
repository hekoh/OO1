package Test;

import Clases.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCorreo {
	private ClienteDeCorreo cliente;
	private Carpeta importante;
	private Carpeta Spam;
	private Email mail1;
	private Email mail2;
	private Email mail3;
	private Email mail4;
	private Archivo img;
	
	 @BeforeEach
	 public void setup() {
		 cliente = new ClienteDeCorreo();
		 importante = new Carpeta("importante");
		 Spam = new Carpeta("spam");
		 mail1 = new Email("Primer Mail","Bienvenido!");
		 img = new Archivo("imagen de mi viaje");
		 mail2 = new Email("ya volvi del exterior!","Fin de mis vacaciones",img);
		 mail3 = new Email("tu cuenta esta en peligro!","alerta grave");
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
	 }
	
	 
	 @Test
	 public void testTamanio() {
		 assertEquals(img.tamanio(),18);	
		 assertEquals(mail1.tamanio(),22);
		 //assertEquals(mail2.tamanio(),61);
		 //assertEquals(mail3.tamanio(),38);
		 //assertEquals(mail4.tamanio(),40);
		 assertEquals(importante.tamanio(),101);		 
		 //assertEquals(Spam.tamanio(),38);
		 assertEquals(cliente.espacioOcupado(),161);
	 }
	 
	 @Test
	 public void testBuscar() {
		 assertEquals(cliente.buscar("Mail"),mail1);
		 assertEquals(cliente.buscar("en "),mail4);
		 assertEquals(cliente.buscar("hola"),null);
		 assertEquals(importante.buscar("es"),mail2);
		 assertEquals(Spam.buscar("ayuda"),null);
	 }
	  
}
