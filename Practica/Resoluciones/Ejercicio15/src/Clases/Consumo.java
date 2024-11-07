package Clases;

public class Consumo {
	private double activa;
	private double reactiva;
	private Cuadro_Tarifario Cuadro;
	
	public Consumo(double activa, double reactiva, Cuadro_Tarifario cuadro) {
		this.activa = activa;
		this.reactiva = reactiva;
		this.Cuadro = cuadro;
	}
	
	public double costo() {
		return this.activa * Cuadro.getCosto();
	}
	
	public double getActiva() {
		return this.activa;
	}
	
	public double getReactiva() {
		return this.reactiva;
	}
}
