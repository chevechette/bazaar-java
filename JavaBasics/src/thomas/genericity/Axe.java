package thomas.genericity;

import thomas.bazar.Weapon;

public class Axe extends Weapon{
	
	public String name;

	public Axe(String name) {
		super(name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Axe [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void faitDesDegats() {
		System.out.println("La hache s'elance et fait un vacarme térrifiant");
	}
	
	
}
