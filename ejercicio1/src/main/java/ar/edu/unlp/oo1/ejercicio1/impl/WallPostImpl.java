package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */
	private String text;
	private int likes;
	private boolean featured;
	
	
	
	public WallPostImpl() {
		text = "Undefined post";
		likes = 0;
		featured = false;
	}
	
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int getLikes() {
		// TODO Auto-generated method stub
		return likes;
	}

	@Override
	public void like() {
		likes++;
		
	}

	@Override
	public void dislike() {
		if(likes != 0)likes--;
		
	}

	@Override
	public boolean isFeatured() {
		// TODO Auto-generated method stub
		return featured;
	}

	@Override
	public void toggleFeatured() {
		// TODO Auto-generated method stub
		featured = !featured;
	}

}
