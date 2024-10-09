package Clases;

public class CuentaCorriente extends Cuenta{
	private double limite;
	
	
	public CuentaCorriente() {
		super();
		this.limite = 0;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = 0 - limite;
	}
	
	public boolean puedeExtraer(double monto) {
		if((this.getSaldo() - monto) >= this.getLimite()) {
			return true;
		}
		return false;
	}
	
	
	
	
}
