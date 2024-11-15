package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class CuadroTarifario {
	//private ArrayList<Pais> paises;		
	private Map<Pais,Double> costoPais;
	
	
	public CuadroTarifario() {
		//this.paises = new ArrayList<Pais>();
		this.costoPais = new HashMap<Pais,Double>();
	}
	
	public void agregarPais(Pais p) {
		//this.paises.add(p);
		costoPais.put(p, 0.0);
	}
	
	public void modificarCosto(Pais p,double valor) {
		costoPais.replace(p, valor);
	}
	public double costoLocal(boolean rapido) {
		if(rapido)
			return 1500.0;
		else
			return 1000.0;
	}
	
	public double costoUrbano(double distancia) {
		if(distancia < 100)
			return 20.0;
		else if(distancia <= 500)
			return 25.0;
		else
			return 30.0;
	}
	
	public double costoPeso(double peso) {
		if(peso <= 1000)
			return 10.0;
		else
			return 12.0;
	}
	
	/*private Pais getPais(String destino) {
		boolean sigo = true;
		Pais aux = new Pais("null",0.0);
		Iterator<Pais>iterador = paises.iterator();
		while(sigo && iterador.hasNext()) {
			 aux = iterador.next();
			sigo = (aux.getNombre() == destino);
		}
		return aux;
	}*/
	
	public double costoPais(Pais destino) {
		return costoPais.get(destino);
	}

}
	

