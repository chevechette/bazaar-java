package thomas.genericity;

import thomas.bazar.Weapon;

public class Sword extends Weapon{
	
	public String name;
	
	public Sword(String name) {
		super(name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sword [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void faitDesDegats() {
		System.out.println("L'épée s'elance et fait un vacarme térrifiant");
	}
	
}
