package Clases;

public abstract class Pieza {
	private String color;
	private String material;
	
		
	public Pieza(String color, String material) {
		this.color = color;
		this.material = material;
	}
	
	public abstract double superficie();
	
	public abstract double volumen();
	
	public boolean colorIgual(String color) {	//mantiene encapsulamiento (creo)
		return(this.color == color);
	}
	
	public boolean materialIgual(String material) {
		return(this.material == material);
	}
	
}
