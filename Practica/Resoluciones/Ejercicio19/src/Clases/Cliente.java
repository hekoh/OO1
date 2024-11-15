package Clases;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;

public abstract class Cliente {
	private String nombre;
	private String direccion;	//"calle num"
	private Pais localidad;
	private ArrayList<Envio> envios;
	
	public Cliente(String nombre, String direccion, Pais localidad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new ArrayList<Envio>();
	}
	
	public void AgregarEnvio(Envio E) {
		this.envios.add(E);
	}
	
	public double montoApagar(LocalDate inicio, LocalDate fin,CuadroTarifario cuadro) {
		double total = 0;
		Iterator<Envio> iterador = envios.iterator();
		while(iterador.hasNext()) {
			Envio aux = iterador.next();
			if(aux.periodo(inicio, fin))
				total+= aux.montoApagar(cuadro);
		}
		return total;
	}
	
}
