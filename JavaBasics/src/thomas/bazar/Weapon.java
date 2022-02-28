package thomas.bazar;

public abstract class Weapon {
	private  String name;
	
	public abstract void faitDesDegats();

	public Weapon(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Weapon [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
