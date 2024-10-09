package Test;

import Clases.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestPiezas {
	private Pieza cilin;
	private Pieza esfer;
	private Pieza prisma;
	private Pieza prisma2;
	private ReporteDeConstruccion reporte;
	
	
	@BeforeEach
	public void setUp() {
		cilin = new Cilindro("rojo","plata",3,5);
		esfer = new Esfera("negro","plata",4);
		prisma = new PrismaRectangular("rojo","oro",4,7,6);
		prisma2 = new PrismaRectangular("negro","oro",3,5,8);
		reporte = new ReporteDeConstruccion();
		reporte.agregarPieza(cilin);
		reporte.agregarPieza(esfer);
		reporte.agregarPieza(prisma);
		reporte.agregarPieza(prisma2);
	}
	
	@Test
	public void testSeteo() {
		assertEquals(cilin.colorIgual("rojo"),true);
		assertEquals(cilin.materialIgual("plata"),true);
		assertEquals(esfer.colorIgual("negro"),true);
		assertEquals(esfer.materialIgual("plata"),true);
		assertEquals(prisma.colorIgual("rojo"),true);
		assertEquals(prisma.materialIgual("oro"),true);
		assertEquals(prisma2.colorIgual("negro"),true);
		assertEquals(prisma2.materialIgual("oro"),true);
	}
	
	@Test
	public void testSuperficies() {
		assertEquals(cilin.superficie(),150.796,0.01);
		assertEquals(esfer.superficie(),201.062,0.01);
		assertEquals(prisma.superficie(),188,0.01);
		assertEquals(prisma2.superficie(),158,0.01);
		assertEquals(reporte.superficieDeColor("rojo"),cilin.superficie() + prisma.superficie());
		assertEquals(reporte.superficieDeColor("negro"),esfer.superficie() + prisma2.superficie());
	}
	@Test
	public void testVolumenes() {
		assertEquals(cilin.volumen(),141.372,0.01);
		assertEquals(esfer.volumen(),268.083,0.01);
		assertEquals(prisma.volumen(),168,0.01);
		assertEquals(prisma2.volumen(),120,0.01);
		assertEquals(reporte.volumenDeMaterial("plata"),cilin.volumen() + esfer.volumen());
		assertEquals(reporte.volumenDeMaterial("oro"), prisma.volumen() + prisma2.volumen());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

