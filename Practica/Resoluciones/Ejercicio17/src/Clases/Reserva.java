package Clases;

import java.time.LocalDate;

public class Reserva {
	private DateLapse lapso;
	private Propiedad inmueble;
	
	
	public Reserva(Propiedad prop, LocalDate desde, LocalDate hasta) {
		this.inmueble = prop;
		this.lapso = new DateLapse(desde,hasta);
	}
	
	public double precio() {
		return(inmueble.getPrecio() * lapso.sizeInDays());
	}
	
	public DateLapse getLapso() {
		return this.lapso;
	}
	
}
