package thomas.animals;

public class Chien extends Animal{

	public Chien(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chien []");
		return builder.toString();
	}
	
	

}
