package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import Clases.Categoria;

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
	
	public int cantidad() {
		return((int) emails.stream().count());
	}
	

	public BagImpl<String> devolverCategorias(Categoria cat,BagImpl<String> bag){
		Iterator<Email> iterador = this.emails.iterator();
		while(iterador.hasNext()) {
			Email aux = iterador.next();
			bag.add(aux.getCategoria(cat));
		}
		return bag;
	}
	
}
