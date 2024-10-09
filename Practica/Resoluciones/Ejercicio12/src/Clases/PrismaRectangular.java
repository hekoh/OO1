package Clases;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private double altura;
	
	public PrismaRectangular(String color, String material,int menor, int mayor, double alto) {
		super(color,material);
		this.ladoMayor = mayor;
		this.ladoMenor = menor;
		this.altura = alto;
	}
	
	public double volumen() {
		return(this.ladoMenor * this.ladoMayor * this.altura);
	}
	
	public double superficie() {
		return(2*((this.ladoMayor*this.ladoMenor)+(this.ladoMayor*this.altura)+(this.ladoMenor*this.altura)));
	}
}
