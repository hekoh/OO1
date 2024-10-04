package Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit; 

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double interesDiario;	// %x
	
	
	public PlazoFijo() {
		this.fechaDeConstitucion = LocalDate.now();
		this.montoDepositado = 0;
	}
	
	public PlazoFijo(double monto, double interes, LocalDate fecha) {
		this.fechaDeConstitucion = fecha;
		this.montoDepositado = monto;
		this.interesDiario = interes;
	}
	
	public void setInteres(double interes) {
		this.interesDiario = interes;
	}
	
	
	
	public double valorActual() {
		double act = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now());
		double interes = (act * interesDiario)/this.montoDepositado;
		return(this.montoDepositado + (this.montoDepositado * interes));
	}
	
	
	
	
	
	
	
	
	
	
}
