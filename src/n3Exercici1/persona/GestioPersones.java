package n3Exercici1.persona;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class GestioPersones {
	List<Persona> persones = new ArrayList<Persona>();
	
	
	public void introduirPersona() {
		String name;
		String cognoms;
		final String dni;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nom: ");
		name = scanner.nextLine();
		System.out.print("Cognoms: ");
		cognoms = scanner.nextLine();
		System.out.print("DNI: ");
		dni = scanner.nextLine();
		persones.add(new Persona(name, cognoms, dni));
		printToFile(name, cognoms, dni, "RegistroPersonas.csv");
		scanner.close();
	}
	
	public void mostrarPersonesNomAZ() {
		// Order the list by comparator
		Collections.sort(persones, new PersonaNomComparator());
		printByConsole();
	}
	
	public void mostrarPersonesNomZA() {
		// Order the list by comparator
		Collections.sort(persones, new PersonaNomComparator().reversed());
		printByConsole();
	}
	
	public void mostrarPersonesCognomAZ() {
		// Order the list by comparator
		Collections.sort(persones, new PersonaCognomComparator());
		printByConsole();
	}
	
	public void mostrarPersonesCognomZA() {
		// Order the list by comparator
		Collections.sort(persones, new PersonaCognomComparator().reversed());
		printByConsole();
	}
	
	public void mostrarPersonesDni09() {
		// Order the list by comparator
		Collections.sort(persones, new PersonaDniComparator());
		printByConsole();
	}

	public void mostrarPersonesDni90() {
		// Order the list by comparator
		Collections.sort(persones, new PersonaDniComparator().reversed());
		printByConsole();
	}
	
	public void printByConsole() {
		// Show all by console
		System.out.println("___Nom___     ____Cognoms___     __NIF__");
		for(Persona persona: persones) {
			System.out.println(persona);
		}
		System.out.println();
	}
	
	// This method reads the people records from a file
	public void loadPersonsFromFile(String path) {
		String[] words = new String[3];
		String line;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			while((line = br.readLine()) != null) {
				line = line.trim();
				
				if (!line.trim().equals("")) {
					words = line.split(", ");
					//System.out.println(words.toString());
					persones.add(new Persona(words[0], words[1], words[2]));
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Excepció: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Excepció: " + e.getMessage());
		}
	}
	
	
	public void printToFile(String nom, String cognom, String dni, String fileName) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
			pw.println( nom + ", " + cognom + ", " + dni);
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
