package Clases;

import java.util.ArrayList;

public class Email {
	private String titulo;
	private String cuerpo;
	private ArrayList<Archivo> adjuntos;
	
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public Email(String titulo, String cuerpo, Archivo adjunto) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
		this.adjuntos.add(adjunto);
	}
	
	public void agregarAdjunto(Archivo adjunto) {
		this.adjuntos.add(adjunto);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public ArrayList<Archivo> getAdjuntos(){
		return this.adjuntos;
	}
	
	public int tamanio() {
		int total = titulo.length() + cuerpo.length();
		for (Archivo arch: adjuntos){
			total+= arch.tamanio();
		}
		return total;
	}
	
	public boolean contiene(String texto) {
		return (this.titulo.contains(texto) || this.cuerpo.contains(texto));
	}
	
}
