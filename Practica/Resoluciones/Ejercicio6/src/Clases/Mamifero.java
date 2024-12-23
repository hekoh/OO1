package Clases;

import java.util.ArrayList;
import java.util.Date;

public class Mamifero {
	private String ID;
	private String especie;
	private Date fecha_nacimiento;
	private Mamifero Padre;
	private Mamifero Madre;
	
	
	public Mamifero(String ID, String Especie, Date Fecha) {
		this.especie = Especie;
		this.ID = ID;
		this.fecha_nacimiento = Fecha;
		this.Padre = null;
		this.Madre = null;
	}
	
	public Mamifero(String ID) {
		this.ID = ID;
		Padre = null;
		Madre = null;
	}
	
	public Mamifero() {
		Padre = null;
		Madre = null;
	}
	
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public Mamifero getPadre() {
		return Padre;
	}


	public void setPadre(Mamifero padre) {
		this.Padre = padre;
	}


	public Mamifero getMadre() {
		return Madre;
	}


	public void setMadre(Mamifero madre) {
		this.Madre = madre;
	}
	
	
	public Mamifero getAbueloPaterno() {
		if(Padre != null)
			return this.Padre.getPadre();
		else
			return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if(Madre != null)
			return this.Madre.getPadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(Padre != null)
			return this.Padre.getMadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(Madre != null)
			return this.Madre.getMadre();
		else
			return null;
	}
	

	private ArrayList<Mamifero> getAncestros(ArrayList<Mamifero> ListaAncestros){	//corregido
		if(this.Padre!= null) {
			ListaAncestros.add(Padre);
			ListaAncestros = Padre.getAncestros(ListaAncestros);
		}
		if(this.Madre != null) {
			ListaAncestros.add(Madre);
			ListaAncestros = Madre.getAncestros(ListaAncestros);
		}
		return(ListaAncestros);
	}
	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		ArrayList<Mamifero> aux = new ArrayList<Mamifero>();
		getAncestros(aux);
		int i = 0;
		boolean ancestro = false;
		while((i < aux.size()) && !ancestro) {					
			if(aux.get(i) == mamifero)							
				ancestro = true;
			i++;
		}
		return (ancestro);
	}
	
	
}
