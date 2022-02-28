package thomas.bazar;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cheval> {

	@Override
	public int compare(Cheval o1, Cheval o2) {
		if(o1.getAge() < o2.getAge())
			return 1;
		else if(o1.getAge() > o2.getAge()) {
			return -1;
		}else {
			return 0;
		}
	}
}


// Une liste d'orcs avec 4 Orcs.
// Créer un comparator qui trie les ORcs par force.
