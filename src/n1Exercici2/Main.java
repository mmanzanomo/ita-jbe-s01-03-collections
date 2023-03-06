package n1Exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		// Create two ArrayList of Intenger
		List<Integer> primeraLlista = new ArrayList<Integer>();
		List<Integer> segonaLlista = new ArrayList<Integer>();

		primeraLlista.add(1);
		primeraLlista.add(2);
		primeraLlista.add(3);
		primeraLlista.add(4);
		primeraLlista.add(5);
		primeraLlista.add(6);
		primeraLlista.add(7);
		primeraLlista.add(8);
		primeraLlista.add(9);
		primeraLlista.add(10);
		
		// Creates a listIterator and put cursor on last position
		ListIterator<Integer> iterator = primeraLlista.listIterator(primeraLlista.size());
		
		// Inserts objects of the first list in the second list in reverse
		while(iterator.hasPrevious()) {
			segonaLlista.add(iterator.previous());
		}

		System.out.println("\nPrimera llista");
		for (Integer num: primeraLlista) {
			System.out.print(num + " ");
		}

		System.out.println("\nSegona llista");
		for (Integer num: segonaLlista) {
			System.out.print(num + " ");
		}
		

	}

}
