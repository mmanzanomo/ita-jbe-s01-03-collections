package n3Exercici1.persona;

import java.util.Comparator;

public class PersonaDniComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		int value;
			
		if (o1.getDNI().compareToIgnoreCase(o2.getDNI()) > 0 ) {
			value = 1;
		} else if (o1.getDNI().compareToIgnoreCase(o2.getDNI()) < 0  ) {
			value = -1;
		} else {
			value = 0;
		}
		
		return value;
	}

}
