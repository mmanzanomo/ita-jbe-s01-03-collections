package n1Exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Month> monthsList = new ArrayList<Month>();
		
		monthsList.add(new Month("Gener"));
		monthsList.add(new Month("Febrer"));
		monthsList.add(new Month("Març"));
		monthsList.add(new Month("Abril"));
		monthsList.add(new Month("Maig"));
		monthsList.add(new Month("Juny"));
		monthsList.add(new Month("Juliol"));
		
		monthsList.add(new Month("Setembre"));
		monthsList.add(new Month("Octubre"));
		monthsList.add(new Month("Novembre"));
		monthsList.add(new Month("Desembre"));
		
		// add 'agost' to corresponding position
		monthsList.add(7, new Month("Agost"));
		
		// shows how the list preserves the order
		for(Month month: monthsList) {
			System.out.print(month.getName() + " ");
		}
		
		// Change the above list to hashset
		HashSet<Month> monthsHashSet = new HashSet<Month>();
		monthsHashSet.addAll(monthsList);
		
		// HashSet no guarantees the order of the set
		System.out.println("\nImprimeix HashSet:");
		for(Month month: monthsHashSet) {
			System.out.print(month.getName() + " ");
		}
		
		// add a duplicate item
		monthsHashSet.add(new Month("Setembre"));
		monthsHashSet.add(new Month("Setembre"));
		
		// HashSet uses equals method to avoid duplicates 
		System.out.println("\nImprimeix HashSet sense repetició:");
		for(Month month: monthsHashSet) {
			System.out.print(month.getName() + " ");
		}

		// Recorregut de la llista amb un for
		System.out.println("\nLlista dels messos de l'any recorreguda per un \'for\'");
		for(Month month: monthsList) {
			System.out.print(month.getName() + " ");
		}

		// Recorregut de la llista amb un iterador
		System.out.println("\nLlista dels messos de l'any recorreguda per un iterador");
		ListIterator<Month> listIterator = monthsList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next().getName() + " ");
		}

	}
}
