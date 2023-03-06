package n1Exercici3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	private HashMap<String, String> hashmap = new HashMap<>();
	private Random random = new Random();
	private String username;
	private byte points = 0;
	
	
	public void start(String inputFileName, String outputFileName) {
		readPairsFromFile(inputFileName);
		play();
		saveRecord(outputFileName);
	}
	
	// This method reads set of pairs country - capital from .txt
	public void readPairsFromFile(String path) {
		String[] words;
		String line;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			while((line = br.readLine()) != null) {
				line = line.trim();
				
				if (!line.trim().equals("")) {
					words = line.split(" ");
					// puts pairs into the hashmap
					hashmap.put(words[0], words[1]);										
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Excepció: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Excepció: " + e.getMessage());
		}
	}
		
	public void play() {
		String country;
		String capital;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nom de l'usuari: ");
		this.username = scanner.nextLine();
		

		ArrayList<String> countries = new ArrayList<String>();
		countries.addAll(hashmap.keySet());
		
		for (byte attemps = 10; attemps > 0; attemps--) {
			//country = countries[getRandom(countries.length, random)].toString();
			int position = random.nextInt(countries.size());
			country = countries.get(position);
			//countries.get(position);
			System.out.println("country: " + country);
			System.out.print("capital: ");
			capital = scanner.nextLine();
			
			countries.remove(position);
			
			if (hashmap.get(country).equals(capital)) {
				points += 1;
			}
			
		}		
		System.out.println("Total points: " + points);
		
		scanner.close();
	}
	
	// Save username and points into a file named classificacio.txt
	public void saveRecord(String fileName) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
			pw.println(username + " " + points);
			pw.flush();
		} catch (FileNotFoundException e) {
			// Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
