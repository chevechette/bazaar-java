package rpgviz;

import javax.swing.undo.CannotRedoException;

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

	@Override
	public void attack(Humanoid enemy) {
		// TODO Auto-generated method stub
		this.setDoubleAttackReady(true);
		super.attack(enemy);
	}

	public void doubleAttack(Humanoid enemy) throws CannotRedoException {
		if (!this.doubleAttackReady)
			throw new CannotRedoException();
		this.doubleAttackReady = false;
		enemy.receiveDamage(this.force * 0.7);
		enemy.receiveDamage(this.force * 0.7);
	}

	public boolean isDoubleAttackReady() {
		return doubleAttackReady;
	}

	public void setDoubleAttackReady(boolean doubleAttackReady) {
		this.doubleAttackReady = doubleAttackReady;
	}
}
