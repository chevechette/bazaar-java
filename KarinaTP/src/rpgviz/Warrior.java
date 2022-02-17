package rpgviz;

public class Warrior extends Humanoid {
	private boolean		doubleAttackReady;

	public Warrior(String name, double health, int force) {
		super(name, health, force);
		this.doubleAttackReady = true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Warrior [doubleAttackReady=");
		builder.append(doubleAttackReady);
		builder.append("]");
		return builder.toString();
	}

	public void doubleAttack(Humanoid enemy) {
		if (this.doubleAttackReady) {
			this.attack(enemy);
			return ;
		}
		this.doubleAttackReady = false;
		enemy.receiveDamage(this.force * 0.7);
		enemy.receiveDamage(this.force * 0.7);
	}
}
