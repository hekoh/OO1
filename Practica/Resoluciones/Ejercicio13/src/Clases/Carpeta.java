package Clases;

import java.util.ArrayList;

public class Carpeta {
	private String nombre;
	private ArrayList<Email> emails;
	
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public void agregarMail(Email mail) {
		emails.add(mail);
	}
	
	public void mover(Email mail, Carpeta destino) {
		if(emails.contains(mail)) {
			destino.agregarMail(mail);
			emails.remove(mail);
		}
	}
	
	public ArrayList<Email> getMails(){
		return this.emails;
	}
	
	public int tamanio() {
		int total = 0;
		for (Email mail: this.emails) {
			total+= mail.tamanio();
		}
		return total;
	}
	
	public Email buscar(String texto) {
		for (Email mail: this.emails) {
			if(mail.contiene(texto)) {
				return(mail);
			}
		}
		return null;
	}
}
