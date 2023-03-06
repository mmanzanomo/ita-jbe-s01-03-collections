package n3Exercici1.persona;

public class Persona {
	private String nom;
	private String cognom;
	private String dni;
	
	
	public Persona(String nom, String cognom, String dni) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.dni = dni;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return (nom + "\t    " + cognom + "\t    " + dni);
	}
	
	
	
}
