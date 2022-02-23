package ajc.basics;

public class EvolvedOrc<T> extends Orc {
	private T	weapon;

	public EvolvedOrc(int health, int force) {
		super(health, force);
		this.equip(null);
	}

	public EvolvedOrc(String name, int health, int force) {
		super(name, health, force);
		this.equip(null);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EvolvedOrc [weapon=");
		builder.append(weapon);
		builder.append("]");
		return builder.toString();
	}

	public T getWeapon() {
		return weapon;
	}

	public void equip(T weapon) {
		this.weapon = weapon;
	}	
}
