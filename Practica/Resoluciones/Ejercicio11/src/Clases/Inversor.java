package Clases;

import java.util.ArrayList;

public class Inversor {
	private String nombre;
	private ArrayList<Inversion> inversiones;
	
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<Inversion>();
	}
	
	public void addInversion(Inversion nueva) {
		inversiones.add(nueva);
	}
	
	public double valorActual() {		//robado de pancho
		return (inversiones.stream().mapToDouble(inversion -> inversion.valorActual()).sum()); 
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
