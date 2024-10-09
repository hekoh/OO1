package Clases;

public class Esfera extends Pieza{
	private int radio;
	
	
	public Esfera(String color, String material, int radio) {
		super(color,material);
		this.radio = radio;
	}
	
	public double superficie() {
		return(4*3.1416*Math.pow(radio, 2));
	}
	
	public double volumen() {
		return((4.0/3.0)*3.1416*Math.pow(this.radio, 3));
	}
	
}
