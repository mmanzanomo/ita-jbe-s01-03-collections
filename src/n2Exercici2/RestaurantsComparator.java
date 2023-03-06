package n2Exercici2;

import java.util.Comparator;

import n2Exercici1.Restaurant;

public class RestaurantsComparator implements Comparator<Restaurant> {

	@Override
	public int compare(Restaurant o1, Restaurant o2) {
		
		int value;
		
		if (o1.getNom().compareToIgnoreCase(o2.getNom()) == 0) {
			
			if (o1.getPuntuacio() > o2.getPuntuacio()) {
				value = -1;
			} else if (o1.getPuntuacio() < o2.getPuntuacio()) {
				value = 1;
			} else {
				value = 0;
			}
		} else if (o1.getNom().compareToIgnoreCase(o2.getNom()) > 0 ) {
			value = -1;
		} else {
			value = 1;
		}
		
		return value;
	}
	
}
