package Clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private ArrayList<Propiedad> propiedades;
	
	
	
	public Usuario(String nombre, String direccion, int DNI){
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public void Reserva(Propiedad Prop, DateLapse lapso) {
		Prop.addReserva(null);
	}
	
	public void addPropiedad(Propiedad prop) {
		this.propiedades.add(prop);
	}
	
	public double ingresos(DateLapse lapso) {
		double total = 0;
		Iterator<Propiedad> iterador = propiedades.iterator();
		while (iterador.hasNext()) {
			total+= iterador.next().recaudacion(lapso);
		}
		return total*0.75;
	}
}
