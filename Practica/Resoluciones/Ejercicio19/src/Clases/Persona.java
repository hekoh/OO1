package Clases;

import java.time.LocalDate;

public class Persona extends Cliente{
	private int DNI;
	
	public Persona(String nombre, String direccion,int DNI, Pais local) {
		super(nombre, direccion,local);
		this.DNI = DNI;
	}
	
	public double montoApagar(LocalDate inicio, LocalDate fin,CuadroTarifario cuadro) {
		double aux = super.montoApagar(inicio, fin, cuadro);
		return aux*0.9;
	}

}
