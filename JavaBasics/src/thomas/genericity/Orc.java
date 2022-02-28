package thomas.genericity;

import thomas.bazar.Weapon;

public class Orc<T extends Weapon> {
	
	private String name;
	private T weapon;
	
	
	public Orc(String name) {
		super();
		this.name = name;
	}

	public void equip(T equip) {
		this.weapon = equip;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getWeapon() {
		return weapon;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Orc [name=");
		builder.append(name);
		builder.append(", weapon=");
		builder.append(weapon);
		builder.append("]");
		return builder.toString();
	}


	
	
}
