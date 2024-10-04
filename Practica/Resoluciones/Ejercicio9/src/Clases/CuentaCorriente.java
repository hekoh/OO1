package Clases;

public class CuentaCorriente extends Cuenta{
	private double saldo;
	private double limite;
	
	
	public CuentaCorriente() {
		this.saldo = 0;
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
