package ar.edu.unlp.info.oo1.Ejercicio2;

import java.util.List;			//EJ 4
import java.util.ArrayList;		//EJ 4


public class Balanza {
	private int cant;
	private double precioTot;
	private double pesoTot;
	private List<Producto> productos;	//EJ 4
	
	
	public Balanza() {
		ponerEnCero();	
	}
	
	
	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public double getPrecioTot() {
		return precioTot;
	}

	public void setPrecioTot(double precioTot) {
		this.precioTot = precioTot;
	}

	public double getPesoTot() {
		return pesoTot;
	}

	public void setPesoTot(double pesoTot) {
		this.pesoTot = pesoTot;
	}

	public void ponerEnCero() {
		this.cant = 0;
		this.precioTot = 0;
		this.pesoTot = 0;
		this.productos = new ArrayList<Producto>();	//EJ 4
	}
	
	public void agregarProducto(Producto P) {
		//EJ 2
		this.precioTot+= P.getPrecio();
		this.pesoTot+= P.getPeso();
		this.productos.add(P);	//EJ 4
	}
	
	public Ticket emitirTicket() {
		//Ticket Tick = new Ticket(this.cant,this.pesoTot,this.precioTot); EJ 2
		Ticket Tick = new Ticket(this.productos.size(),this.pesoTot,this.precioTot);	//Se podrian eliminar pesoTot y precioTot pero es mas ineficiente(creo)
		return Tick;																	//me da paja
	}
	
}
