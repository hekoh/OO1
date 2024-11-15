package Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class De_planta implements Contrato{
	private LocalDate inicio;
	private double mes;
	private double conyuge;
	private double hijo;
	private Empleado emp;
	
	
	public De_planta(double conyuge, double hijo, double mes, LocalDate inicio) {
		this.conyuge = conyuge;
		this.hijo = hijo;
		this.mes = mes;
		this.inicio = inicio;
	}
	
	public void agregarEmpleado(Empleado emp) {
		this.emp = emp;
	}
	
	public boolean vigente() {
		return true;
	}
	
	public long duracion() {
		return(ChronoUnit.DAYS.between(inicio, LocalDate.now()));
	}
	
	private double antiguedad() {		//se puedo hacer con un for (es un quilombo)
		if(this.emp.antiguedad() >= 7305)
			return(2);
		else if(this.emp.antiguedad() >= 5478)
			return(1.7);
		else if(this.emp.antiguedad() >= 3652)
			return(1.5);
		else if(this.emp.antiguedad() >= 1826)
			return(1.3);
		else
			return(1);
	}
	
	private double basico() {
		double aux = mes;
		if(emp.tieneConyuge())
			aux+= this.conyuge;
		if(emp.tieneHijos())
			aux+= this.hijo;
		return aux;
	}
	
	public double sueldo() {
		return(basico() * antiguedad());
	}
	
	
	
	
}
