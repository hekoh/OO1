package Clases;

import java.util.ArrayList;

public class Farola {
	private boolean prendida;
	private ArrayList<Farola> vecinas;
	
	
	public Farola() {
		this.prendida = false;
		this.vecinas = new ArrayList<Farola>();
	}
	
	public ArrayList<Farola> getNeighbors(){
		return(vecinas);
	}
	
	public void pairWithNeighbor(Farola Farola) {			//corregido
		if(!this.vecinas.contains(Farola)) {
			this.vecinas.add(Farola);
			Farola.pairWithNeighbor(this);
		}
	}
	
	public void turnOn() {
		if(this.isOff()) {
			this.prendida = true;
			for (int i = 0; i < this.vecinas.size(); i++) {
				this.vecinas.get(i).turnOn();
			}
		}	
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.prendida = false;
			for (int i = 0; i < this.vecinas.size(); i++) {
				this.vecinas.get(i).turnOff();
			}
		}	
	}
	
	public boolean isOn() {
		return (prendida == true);
	}
	
	public boolean isOff() {
		return (prendida == false);
	}
	
}
