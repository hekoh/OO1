package ar.edu.unlp.info.oo1.Ejercicio2;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cant;
	private double pesoTot;
	private double precioTot;
	
	
	public Ticket(int cant, double pesoTot, double precioTot) {
		this.fecha = LocalDate.now();
		this.cant = cant;
		this.pesoTot = pesoTot;
		this.precioTot = precioTot;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public double getPesoTot() {
		return pesoTot;
	}

	public void setPesoTot(double pesoTot) {
		this.pesoTot = pesoTot;
	}

	public double getPrecioTot() {
		return precioTot;
	}

	public void setPrecioTot(double precioTot) {
		this.precioTot = precioTot;
	}

	public double impuesto() {
		return (this.precioTot * 0.21);
	}
	
	public String toString() {
		return("TICKET CON FECHA " + this.fecha + "\n CANTIDA DE PRODUCTOS: " +this.cant + "\n PESO TOTAL: " + this.pesoTot + "\n PRECIO: " + this.precioTot);
	}
	
	
	
}
