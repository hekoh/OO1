package Clases;

import java.time.LocalDate;

public class Locales extends Envio {
	private boolean rapido;
	
	
	public Locales(boolean rapido,String origen, String destino, LocalDate fecha, double peso) {
		super(origen,destino,fecha,peso);
		this.rapido = rapido;
	}
	
	public double montoApagar(CuadroTarifario cuadro) {
		return(cuadro.costoLocal(this.rapido));
	}
}
