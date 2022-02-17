package rpgviz;

public abstract class Humanoid {
	protected String	name;
	protected double	health;
	protected int		force;
	
	public Humanoid(String name, double health, int force) {
		this.setName(name);
		this.setHealth(health);
		this.setForce(force);
	}
	
	public void attack(Humanoid enemy) {
		enemy.receiveDamage(force);
	}
	
	public void receiveDamage(double damage) {
		this.setHealth(this.health - damage);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Humanoid [name=");
		builder.append(name);
		builder.append(", health=");
		builder.append(health);
		builder.append(", force=");
		builder.append(force);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public double getHealth() {
		return health;
	}

	public int getForce() {
		return force;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public void setForce(int force) {
		this.force = force;
	}
}
