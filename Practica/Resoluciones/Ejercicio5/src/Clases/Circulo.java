package Clases;

public class Circulo implements Figuras {
	private double radio;
	private double Diametro;
	
	
	public Circulo() {
		
	}
	
	public double getPerimetro() {
		return (3.14159 * this.radio * 2);
	}
	
	public double getDiametro() {
		return(radio * 2);
	}
	
	public void setDiametro(double diametro) {
		this.Diametro = diametro;
		this.radio = diametro/2;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
		this.Diametro = radio * 2;
	}
	
	public double getArea() {
		return(3.14159 * Math.pow(radio, 2));
	}
	
	
}
