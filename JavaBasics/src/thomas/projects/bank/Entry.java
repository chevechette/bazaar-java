package thomas.projects.bank;

public class Entry {

	public static void main(String[] args) {
		CompteSimple cs1 = new CompteSimple(100);
		CompteEpargne c = new CompteEpargne();
		
		c.retirer(0);
	}

}
