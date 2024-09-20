package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private String texto;
	private int likes;
	private boolean destacado;
	
	public WallPostImpl() {
		this.texto = "Undefined post";
		this.likes = 0;
		this.destacado = false;
	}
	
	
	
	@Override
	public String getText() {
		return texto;
	}
	
	@Override
	public void setText(String text) {
		this.texto = text;
	}
	
	@Override
	public int getLikes() {
		return this.likes;
	}
	
	@Override
	public void like() {
		this.likes+= 1;
	}
	
	@Override
	public void dislike() {
		if(this.likes > 0) {
			likes+= -1;
		}
	}
	
	@Override
	public boolean isFeatured() {
		return this.destacado;
	}

	@Override
	public void toggleFeatured() {
		if(!this.destacado)
			this.destacado = true;
		else
			this.destacado = false;
	}
	
	
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
