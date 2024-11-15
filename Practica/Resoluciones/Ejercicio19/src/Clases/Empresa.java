package Clases;

public class Empresa extends Cliente{
	private int CUIT;
	
	
	public Empresa(String nombre, String direccion, int CUIT, Pais local) {
		super(nombre, direccion,local);
		this.CUIT = CUIT;
	}
	
}
