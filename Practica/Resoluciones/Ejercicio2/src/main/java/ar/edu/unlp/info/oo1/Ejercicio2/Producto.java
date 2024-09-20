package ar.edu.unlp.info.oo1.Ejercicio2;

public class Producto {
	private double peso;
	private double precioKilo;
	private String desc;
	
	public Producto() {
	}
	
	public Producto(double peso, double precioKilo, String desc) {
		this.peso = peso;
		this.precioKilo = precioKilo; 
		this.desc = desc;
	}
	
	public double getPrecioKilo() {
		return precioKilo;
	}

	public void setPrecioKilo(double precioKilo) {
		this.precioKilo = precioKilo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return this.peso;
	}
	
	public double getPrecio() {
		return (peso * precioKilo);
	}
	
}
