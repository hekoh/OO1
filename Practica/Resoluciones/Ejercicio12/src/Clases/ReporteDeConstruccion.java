package Clases;

import java.util.ArrayList;

public class ReporteDeConstruccion {
	private  ArrayList<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	
	public double volumenDeMaterial(String mat) {
		if(!piezas.isEmpty()) {
			double total = 0;
			for (int i = 0; i < piezas.size(); i++) {
				if(piezas.get(i).materialIgual(mat))
					total+= piezas.get(i).volumen(); 
			}
			return total;
		}
		return 0;
	}
	
	public double superficieDeColor(String color) {
		if(!piezas.isEmpty()) {
			double total = 0;
			for(int i = 0; i < piezas.size(); i++) {
				if(piezas.get(i).colorIgual(color))
					total+= piezas.get(i).superficie();
			}
			return total;
		}
		return 0;
	}
}
