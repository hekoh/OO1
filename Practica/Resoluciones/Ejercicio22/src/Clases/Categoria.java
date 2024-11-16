package Clases;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class Categoria {
	Map<String,Double> rangos;
	
	public Categoria() {
		this.rangos = new HashMap<String,Double>();
	}
	
	public void setRangos(String key, double val) {
		rangos.put(key, val);
	}
	
	public String categ(int tam) {	//mejorable, safa
		double aux = 0.0;
		String auxK = "";
		Iterator iterador = rangos.keySet().iterator();
		while(iterador.hasNext()) {
			auxK = (String) iterador.next();
			aux = (double) rangos.get(auxK);
			if(tam <= aux) {
				return auxK;
			}
		}
		return auxK;	//si es mayor que todos, retorna el ultimo
	}
 
	
}
