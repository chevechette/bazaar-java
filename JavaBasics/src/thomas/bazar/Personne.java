package thomas.bazar;

public abstract class Personne {
	
	String name;
	int points;
	
	public abstract void eat();
	
	public void displayName() {
		System.out.println(name);
	}
	
}
