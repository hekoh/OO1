package Clases;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public Item(String det, int cant, double costo) {
		this.detalle = det;
		this.cantidad = cant;
		this.costoUnitario = costo;
	}
	
	public double costo() {
		return(this.costoUnitario*this.cantidad);
	}
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
}
