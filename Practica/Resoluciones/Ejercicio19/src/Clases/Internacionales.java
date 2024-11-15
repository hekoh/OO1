package Clases;

import java.time.LocalDate;

public class Internacionales extends Envio{
	private Pais destino;
	
	public Internacionales(String origen, String destino, LocalDate fecha, double peso, Pais dest) {
		super(origen,destino,fecha,peso);
		this.destino = dest;
	}
	
	public double montoApagar(CuadroTarifario cuadro) {
		double cPais = cuadro.costoPais(destino);
		double aux = cuadro.costoPeso(super.getPeso());
		return(aux*super.getPeso() + cPais);
	}
	
	
	
}
