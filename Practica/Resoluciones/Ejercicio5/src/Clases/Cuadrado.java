package Clases;

public class Cuadrado implements Figuras{
	private double lado;
	
	
	public Cuadrado() {
		
	}
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
		
	public double getArea() {
		return(Math.pow(lado, 2));
	}
	
	public double getPerimetro() {
		return(lado*4);
	}
	
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	
}
