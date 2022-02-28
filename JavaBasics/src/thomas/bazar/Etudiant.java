package thomas.bazar;

public class Etudiant extends Personne{

	@Override
	public void eat() {
		this.points -= 2;
	}

}
