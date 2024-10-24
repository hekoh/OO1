package Clases;

import java.util.ArrayList;

public class ClienteDeCorreo {
	private ArrayList<Carpeta> carpetas;
	
	
	public ClienteDeCorreo() {
		carpetas = new ArrayList<Carpeta>();
		Carpeta inbox = new Carpeta("inbox"); 	//podria ser una variable de instancia
		carpetas.add(0, inbox); 				//imserta la carpeta  por default inbox
	}
	
	public Carpeta getInbox() {
		return this.carpetas.get(0);
	}
	
	public void nuevaCarpeta(Carpeta carp) {
		this.carpetas.add(carp);
	}
	
	public void recibir(Email mail) {
		carpetas.get(0).agregarMail(mail);		//posicion 0 corresponde a inbox
	}
	
	public Email buscar(String texto) {
		for (Carpeta carp: this.carpetas) {
			Email aux = carp.buscar(texto);
			if(aux != null) {
				return aux;
			}
		}
		return null;
	}
	
	public int espacioOcupado() {
		int total = 0;
		for (Carpeta carp: this.carpetas) {
			total+= carp.tamanio();
		}
		return total;
	}
}
