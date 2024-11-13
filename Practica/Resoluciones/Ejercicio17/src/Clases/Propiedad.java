package Clases;

import java.util.ArrayList;
import 	Clases.Ejercicio18.*;
import java.util.Iterator;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precio;
	private ArrayList<Reserva> reservas;
	private Politica devolucion;
	
	public Propiedad(String direccion, String nombre, double precio) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precio = precio;
		this.reservas = new ArrayList<Reserva>();
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean disponible(DateLapse lapso) {
		boolean aux = false;
		int i = 0;
		while((!aux) && i < (reservas.size())) {
			aux = reservas.get(i).getLapso().overlaps(lapso);
			i++;
		}
		return(!aux);
	}
	
	public Reserva getReserva(int puntero) {
		return this.reservas.get(puntero);
	}
	
	public void addReserva(DateLapse lapso) {
		if(this.disponible(lapso)) {
			reservas.add(new Reserva(this,lapso.getFrom(),lapso.getTo()));
			
		}
	}
	
	/*public void cancelarReserva(Reserva reserv) {		EJERCICIO 17
		this.reservas.remove(reserv);
	} 
	*/
	public double cancelarReserva(Reserva reserv) {		//EJERCICIO 18
		double aux = reserv.precio();
		this.reservas.remove(reserv);
		return this.devolucion.devolucion(aux, reserv.getLapso().getFrom());
	}
	
	public double recaudacion(DateLapse lapso) {
		double total = 0;
		Iterator<Reserva> iterador = reservas.iterator();
		while(iterador.hasNext()) {
			Reserva aux = iterador.next();
			if(lapso.overlaps(aux.getLapso())) {
				total+= aux.precio();
			}
		}
		return total;
	}
	
	public void cambiarPolitica(Politica pol) {
		this.devolucion = pol;
	}

	
	
}
