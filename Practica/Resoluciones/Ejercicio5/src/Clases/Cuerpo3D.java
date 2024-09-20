package Clases;

public class Cuerpo3D {
	private double altura;
	private Figuras CaraBasal;
	
	
	public Cuerpo3D() {
		
	}
	
	public Cuerpo3D(double h, Figuras figura) {
		this.altura = h;
		this.CaraBasal = figura;
	}
	
	public void setCaraBasal(Figuras cara) {
		this.CaraBasal = cara;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getVolumen() {
		return(altura * this.CaraBasal.getArea());
	}
	
	public double getSuperficie() {
		return ((CaraBasal.getPerimetro() * altura) + CaraBasal.getArea() * 2);
	}
}
