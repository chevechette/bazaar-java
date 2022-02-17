package rpgviz;

public class Wizard extends Humanoid {
	static private int	manaCost = 10;
	static private int	manaGain = 1;
	static private int	shieldUseMax = 5;
	
	private int			mana;
	private int			intelligence;
	private boolean		shield;
	private int			hitsOnShield;
	
	public Wizard(String name, double health, int force, int intelligence) {
		super(name, health, force);
		// TODO Auto-generated constructor stub
		this.setMana(10);
		this.setIntelligence(intelligence);
		this.setHitsOnShield(0);
		this.setShield(false);
	}
	
	public void spellcast(Humanoid target) {
		if (this.mana < Wizard.manaCost) {
			return ;
		}
		target.receiveDamage(this.force + this.intelligence);
		this.addMana(-Wizard.manaCost);
	}
	
	public void activateShield() {
		this.setShield(true);
		this.addMana(Wizard.manaGain);
	}
	
	@Override
	public void attack(Humanoid enemy) {
		// TODO Auto-generated method stub
		super.attack(enemy);
		this.addMana(Wizard.manaGain);
	}

	@Override
	public void receiveDamage(double damage) {
		if (this.shield && this.hitsOnShield < Wizard.shieldUseMax) {
			damage *= 0.8;
			this.hitsOnShield++;
		} else if (this.shield && this.hitsOnShield >= Wizard.shieldUseMax) {
			this.setHitsOnShield(0);
			this.shield = false;
		}
		super.receiveDamage(damage);
	}

	public void addMana(int mana) {
		this.setMana(this.mana + mana);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wizard [mana=");
		builder.append(mana);
		builder.append(", intelligence=");
		builder.append(intelligence);
		builder.append(", shield=");
		builder.append(shield);
		builder.append(", hitsOnShield=");
		builder.append(hitsOnShield);
		builder.append("]");
		return builder.toString();
	}
	public int getMana() {
		return mana;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public boolean isShield() {
		return shield;
	}
	public int getHitsOnShield() {
		return hitsOnShield;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void setShield(boolean shield) {
		this.shield = shield;
	}
	public void setHitsOnShield(int hitsOnShield) {
		this.hitsOnShield = hitsOnShield;
	}
	
	
}
