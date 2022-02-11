package ajc.basics;

public class Orc {
	private String	name;
	private int		health;
	private int		force;
	
	public Orc(int health, int force) {
		this(null, health, force);
	}
	
	public Orc(String name, int health, int force) {
		this.setName(name);
		this.setHealth(health);
		this.setForce(force);
	}
	
	public void		attack(Orc ennemy) {
		ennemy.setHealth(ennemy.getHealth() - this.force);
	}

	@Override
	public String toString() {
		StringBuffer		sb;
		
		sb = new StringBuffer("Orc [");
        sb.append("name='").append(this.name)
                .append(", health='").append(this.health).append("/100")
                .append(", force='").append(this.force)
                .append(']');
        return sb.toString();
	}

	public boolean equals(Orc brother) {
		return this.name == brother.name &&
				this.force == brother.force;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getForce() {
		return force;
	}
	
	public boolean	isAlive() {
		return this.health > 0;
	}

	public void setName(String name) {
		this.name = (name != null) ? name : "nameless";
	}

	public void setHealth(int health) {
		if (health < 0) {
			health = 0;
		} else if (health > 100) {
			health = 100;
		}
		this.health = health;
	}

	public void setForce(int force) {
		this.force = force;
	}
	
}
