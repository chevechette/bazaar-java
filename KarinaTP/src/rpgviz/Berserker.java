package rpgviz;

public class Berserker extends Humanoid {
	private static int	rageCost = 8;
	private static int	rageGain = 3;
	
	private int			rage;

	public Berserker(String name, double health, int force) {
		super(name, health, force);
		this.setRage(0);
	}

	public Berserker(String name, double health, int force, int rage) {
		super(name, health, force);
		this.setRage(rage);
	}
	
	public void useRage(Humanoid enemy) {
		if (this.rage < Berserker.rageCost) {
			this.attack(enemy);
			return ;
		}
		this.addRage(-Berserker.rageCost);
		this.rageAttack(enemy);
	}
	
	public void rageAttack(Humanoid enemy) {
		enemy.receiveDamage(this.force * 1.5);
	}
	
	@Override
	public void receiveDamage(double damage) {
		// TODO Auto-generated method stub
		this.addRage(Berserker.rageGain);
		super.receiveDamage(damage);
	}
	
	public void addRage(int rageBuff) {
		this.setRage(this.rage + rageBuff);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Berserker [rage=");
		builder.append(rage);
		builder.append(", name=");
		builder.append(name);
		builder.append(", health=");
		builder.append(health);
		builder.append(", force=");
		builder.append(force);
		builder.append("]");
		return builder.toString();
	}

	public int getRage() {
		return rage;
	}

	public void setRage(int rage) {
		this.rage = rage;
	}
}
