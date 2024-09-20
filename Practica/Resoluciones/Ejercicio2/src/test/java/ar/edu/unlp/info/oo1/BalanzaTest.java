package ar.edu.unlp.info.oo1;
import ar.edu.unlp.info.oo1.Ejercicio2.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BalanzaTest {
 
  private Balanza balanza;
  
  private Producto queso;
  
  private Producto jamon;
  
  @BeforeEach
  void setUp() throws Exception {
    balanza = new Balanza();
    queso = new Producto();
    queso.setPeso(0.1);
    queso.setPrecioKilo(140);
    queso.setDesc("Queso");

    jamon = new Producto();
    jamon.setDesc("Jamón");
    jamon.setPeso(0.1);
    jamon.setPrecioKilo(90);
  }

  @Test
  void testAgregarProducto() {

    balanza.agregarProducto(queso);
    assertEquals(0.1, balanza.getPesoTot());
    assertEquals(14, balanza.getPrecioTot());
    assertEquals(1, balanza.getCant());

    balanza.agregarProducto(jamon);
    assertEquals(0.2, balanza.getPesoTot());
    assertEquals(23, balanza.getPrecioTot());
    assertEquals(2, balanza.getCant());
  }

  @Test
  void testCantidadDeProductos() {
    assertEquals(0, balanza.getCant());
    balanza.agregarProducto(queso);
    assertEquals(1, balanza.getCant());
    balanza.agregarProducto(jamon);
    assertEquals(2, balanza.getCant());
  }  
  
  @Test
  void testEmitirTicket() {
    balanza.agregarProducto(queso);
    balanza.agregarProducto(jamon);
    Ticket ticket = balanza.emitirTicket();
    assertEquals(0.2, ticket.getPesoTot());
    assertEquals(23, ticket.getPrecioTot());
    assertEquals(2, ticket.getCant());
    assertEquals(23 * 0.21, ticket.impuesto());
    assertEquals(LocalDate.now(), ticket.getFecha());

    queso.setPrecioKilo(200);
    jamon.setPrecioKilo(160);
    assertEquals(23, ticket.getPrecioTot());
  }

  @Test
  void testConstructor() {
    assertEquals(0, balanza.getPesoTot());
    assertEquals(0, balanza.getPrecioTot());
    assertEquals(0, balanza.getCant());
  }

  @Test
  void testPesoTotal() {
    assertEquals(0, balanza.getPesoTot());
    balanza.agregarProducto(queso);
    assertEquals(0.1, balanza.getPesoTot());
    balanza.agregarProducto(jamon);
    assertEquals(0.2, balanza.getPesoTot());
  }  

  @Test
  void testPonerEnCero() {
    balanza.agregarProducto(queso);
    balanza.ponerEnCero();
    assertEquals(0, balanza.getPesoTot());
    assertEquals(0, balanza.getPrecioTot());
    assertEquals(0, balanza.getCant());
  }  

  @Test
  void testPrecioTotal() {
    assertEquals(0, balanza.getPrecioTot());
    balanza.agregarProducto(queso);
    assertEquals(14, balanza.getPrecioTot());
    balanza.agregarProducto(jamon);
    assertEquals(23, balanza.getPrecioTot());
  }  
}
