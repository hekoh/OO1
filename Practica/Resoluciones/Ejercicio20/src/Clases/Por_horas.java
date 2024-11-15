package Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Por_horas implements Contrato{
	private double valor_hora;
	private double horas;
	private LocalDate inicio;
	private LocalDate Fin;
	private Empleado emp;
	
	
	public Por_horas(double vh, double horas, LocalDate inicio, LocalDate fin) {
		this.valor_hora = vh;
		this.horas = horas;
		this.inicio = inicio;
		this.Fin = fin;
	}
	
	public boolean vigente() {
		return(this.inicio.isBefore(LocalDate.now().plusDays(1)) && (LocalDate.now().isBefore(Fin)));
	}
	
	public long duracion() {
		if(!this.vigente()) {
			return(ChronoUnit.DAYS.between(inicio, Fin));
		}
		else {
			return(ChronoUnit.DAYS.between(inicio, LocalDate.now()));
		}
	}
	
	private double basico() {
		return horas*valor_hora;
	}
	
	private double antiguedad() {
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
	
	public double sueldo() {
		return (this.basico() * this.antiguedad());
	}
	
	public void agregarEmpleado(Empleado emp) {
		this.emp = emp;
	}
	
}
