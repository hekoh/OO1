package Clases;

public class Cilindro extends Pieza {
	private int radio;
	private int altura;
	
	
	public Cilindro(String color, String material, int radio, int altura) {
		super(color,material);
		this.radio = radio;
		this.altura = altura;
	}
	
	public double superficie() {
		return(2*(3.1416*this.radio*this.altura) + 2*(3.1416*Math.pow(radio, 2)));
	}
	
	public double volumen() {
		return(3.1416*Math.pow(this.radio, 2)*this.altura);
	}
}
