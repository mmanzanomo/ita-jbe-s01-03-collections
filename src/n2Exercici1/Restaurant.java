package n2Exercici1;

import java.util.Objects;

public class Restaurant {
	private String nom;
	private int puntuacio;
	
	// Constructor with all atributes
	public Restaurant(String nom, int puntuacio) {
		super();
		this.nom = nom;
		this.puntuacio = puntuacio;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}


	/* This methods (equals and hashCode) allows HashSet to find equal objects */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		// Two objects are equals if name and points are the same.
		return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacio);
	}
	
	@Override
	public String toString() {
		return "nom: " + nom + ", puntuacio: " + puntuacio;
	}
	
	
}
