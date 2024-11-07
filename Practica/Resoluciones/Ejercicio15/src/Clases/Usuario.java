package Clases;

public class Usuario {
	private String nombre;
	private String domicilio;
	private Consumo consumo;
	
	
	public Usuario(String nombre, String domicilio, Consumo consumo) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumo = consumo;
	}
	
	public Consumo getConsumo() {
		return this.consumo;
	}
	
	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}
	
	public String toString() {
		return("nombre: " + this.nombre + "domicilio: " + this.domicilio);
	}
}
