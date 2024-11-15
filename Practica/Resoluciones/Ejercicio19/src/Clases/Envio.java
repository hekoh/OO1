package Clases;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fecha;
	private String origen;	//"calle num"
	private String destino;	//"calle num"
	private double peso;	//gramos
	
	public Envio(String origen, String destino, LocalDate fecha,double peso) {
		this.destino = destino;
		this.origen = origen;
		this.fecha = fecha;
		this.peso = peso;
	}
	
	public boolean periodo(LocalDate inicio, LocalDate fin) {
		return(this.fecha.isAfter(inicio) && this.fecha.isBefore(fin));
	}
	
	protected double getPeso() {
		return peso;
	}
	
	protected String getDestino() {
		return this.destino;
	}
	
	protected abstract double montoApagar(CuadroTarifario cuadro);
	
		
	
}
