package Clases;


public class InversionEnAcciones implements Inversion{
	private String Nombre;
	private int cantidad;
	private double valorUnitario;
	
	
	
	public InversionEnAcciones(String nombre, int cant, int valor) {
		this.Nombre = nombre;
		this.cantidad = cant;
		this.valorUnitario = valor;
	}
	
	public InversionEnAcciones(String nombre) {
		this.Nombre = nombre;
		this.cantidad = 0;
		this.valorUnitario = 0;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
	public double valorActual() {
		return(this.cantidad * this.valorUnitario);
	}
	
	
}
