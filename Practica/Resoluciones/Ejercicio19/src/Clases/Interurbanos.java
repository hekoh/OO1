package Clases;

import java.time.LocalDate;

public class Interurbanos extends Envio{
	private double distancia;
	
	public Interurbanos(double distancia, String origen, String destino, LocalDate fecha, double peso) {
		super(origen,destino,fecha,peso);
		this.distancia = distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public double montoApagar(CuadroTarifario cuadro) {
		double aux = cuadro.costoUrbano(distancia);
		return(aux * super.getPeso());
	}
}
