package Clases;

public class CajaDeAhorro extends Cuenta{
	
	
	
	public CajaDeAhorro() {
		super();	
	}
	
	public boolean puedeExtraer(double monto) {
		if(monto <= this.getSaldo()) {
			return true;
		}
		return false;
	}
	
	public boolean extraer(double monto) {
		return(super.extraer(monto*1.02));
	}
	
	public void depositar(double monto) {
		super.depositar(monto*0.98);
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		return(super.transferirACuenta(monto*1.02, cuentaDestino));
	}
	
	
	
}
