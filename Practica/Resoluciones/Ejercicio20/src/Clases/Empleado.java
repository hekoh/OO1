package Clases;

import java.time.LocalDate;
import java.util.ArrayList;


public class Empleado {
	private String nombre;
	private String apellido;
	private int cuil;
	private LocalDate fecha_nac;
	private boolean hijos;
	private boolean conyuge;
	private ArrayList<Contrato> contratos;
	
	
	public Empleado(String nombre, String apellido, int cuil, LocalDate nac, boolean hijos, boolean conyuge) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fecha_nac = nac;
		this.hijos = hijos;
		this.conyuge = conyuge;
		this.contratos = new ArrayList<Contrato>();
	}
	
	public boolean tieneHijos() {
		return hijos;
	}
	
	public boolean tieneConyuge() {
		return conyuge;
	}
	
	public void agregarContrato(Contrato cont) {
		this.contratos.add(cont);
		cont.agregarEmpleado(this);
	}
	
	public Contrato vigente() {
		return contratos.stream().filter(Contrato -> Contrato.vigente() == true).findFirst().orElse(null);
	}
	
	public double antiguedad() {
		return(contratos.stream().mapToDouble(Contrato -> Contrato.duracion()).sum())/365;
	}
	
	public double getSueldo() {
		return vigente().sueldo();
	}
	
	public Recibo generarRecibo() {
		return(new Recibo(this.nombre,this.apellido,this.cuil,this.antiguedad(),this.getSueldo()));
	}
	
	
	
}
