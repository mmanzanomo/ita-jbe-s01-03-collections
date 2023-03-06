package n3Exercici1.persona;

import java.util.Comparator;

public class PersonaCognomComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		int value;
		
		if (o1.getCognom().compareToIgnoreCase(o2.getCognom()) == 0) {
			
			if (o1.getNom().compareToIgnoreCase(o2.getNom()) > 0 ) {
				value = -1;
			} else if (o1.getNom().compareToIgnoreCase(o2.getNom()) < 0  ) {
				value = 1;
			} else {
				value = 0;
			}
		} else if (o1.getCognom().compareToIgnoreCase(o2.getCognom()) > 0 ) {
			value = 1;
		} else {
			value = -1;
		}
		
		return value;
	}

}
