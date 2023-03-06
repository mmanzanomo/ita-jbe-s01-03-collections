package n3Exercici1;


import java.util.Scanner;

import n3Exercici1.persona.GestioPersones;


public class App {
	GestioPersones gestioPersones;
	
	public App(GestioPersones gestioPersones) {
		this.gestioPersones = gestioPersones;
	}
	
	
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		String option;

		// Menu
		do {
			System.out.println("1.- Introduir persona.");
			System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
			System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
			System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
			System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
			System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
			System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
			System.out.println("0.- Sortir.");
			System.out.print("> ");
			
			option = scanner.nextLine();
			switch(option) {
				case "1":
					gestioPersones.introduirPersona();
					break;
				case "2":
					gestioPersones.mostrarPersonesNomAZ();
					break;
				case "3":
					gestioPersones.mostrarPersonesNomZA();
					break;
				case "4":
					gestioPersones.mostrarPersonesCognomAZ();
					break;
				case "5":
					gestioPersones.mostrarPersonesCognomZA();
					break;
				case "6":
					gestioPersones.mostrarPersonesDni09();
					break;
				case "7":
					gestioPersones.mostrarPersonesDni90();
					break;
				case "0":
					exit = true;
					break;
				default:
			}
		} while(!exit);
		
		scanner.close();
	}
	
	
}
