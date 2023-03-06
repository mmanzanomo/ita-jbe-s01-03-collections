package n3Exercici1;

import n3Exercici1.persona.GestioPersones;

public class Main {

	public static void main(String[] args) {
		String path = "RegistroPersonas.csv";
		GestioPersones gestioPersones = new GestioPersones();
		App app = new App(gestioPersones);
		
		// Read file and put registers into list of Persons
		gestioPersones.loadPersonsFromFile(path);
		app.menu();
		
	}
	
	
	
	

}
