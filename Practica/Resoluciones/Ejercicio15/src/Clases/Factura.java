package Clases;

import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private Usuario user;
	
	
	public Factura(Usuario user) {
		this.fecha = LocalDate.now();
		this.user = user;
	}
	
	
	public void setUsuario(Usuario user) {
		this.user = user;
	}
	
	private double FPE(double activa, double reactiva) {
		return (activa / (Math.sqrt(Math.pow(activa, 2) + Math.pow(reactiva, 2))));
	}
	
	public String emitir() {
		double costo = this.user.getConsumo().costo();
		double bonificacion = 0;
		double aux = FPE(this.user.getConsumo().getActiva(), this.user.getConsumo().getReactiva());
		if (aux > 0.8) {
			bonificacion = costo * 0.1;
			costo -= bonificacion;
		}
		return(this.user.toString() + this.fecha + bonificacion + costo);
	}
}
