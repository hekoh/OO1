package Clases;

import java.time.LocalDate;

public class Recibo {
	private String nombre;
	private String apellido;
	private int cuil;
	private double antiguedad;
	private LocalDate fecha;
	private double monto;
	
	public Recibo(String nombre, String apellido, int cuil, double antiguedad, double monto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedad = antiguedad;
		this.fecha = LocalDate.now();
		this.monto = monto;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
}
