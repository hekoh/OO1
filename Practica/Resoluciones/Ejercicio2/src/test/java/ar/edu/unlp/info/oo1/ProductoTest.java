package ar.edu.unlp.info.oo1;
import ar.edu.unlp.info.oo1.Ejercicio2.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {

  private Producto queso;
  
  @BeforeEach
  void setUp() throws Exception {
    queso = new Producto();
  }

  @Test
  void testDescripcion() {
    queso.setDesc("Queso crema");
    assertEquals("Queso crema", queso.getDesc());
  }
  
  @Test
  void testPeso() {
    queso.setPeso(100);
    assertEquals(100, queso.getPeso());
  }

  @Test
  void testPrecioPorKilo() {
    queso.setPrecioKilo(100);
    assertEquals(100, queso.getPrecioKilo());
  }

  @Test
  void testPrecio() {
    queso.setPeso(0.1);
    queso.setPrecioKilo(140);
    assertEquals(14, queso.getPrecio());
  }
}
