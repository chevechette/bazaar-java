package dragons;

import java.time.LocalDate;

public class Dragon {
	private String		name;
	private LocalDate	birthDate;
	
	private Stable		stable;
	private Owner		owner;
	private ColorEnum	color;
	
	public Dragon(String name, LocalDate birth, Stable stable, Owner owner, ColorEnum color) {
		this.setName(name);
		this.setBirthDate(birth);
		this.setStable(stable);
		this.setOwner(owner);
		this.setColor(color);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dragon [name=");
		builder.append(name);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", stable=");
		builder.append((stable != null) ? stable.getName() : "none");
		builder.append(", owner=");
		builder.append((owner != null) ? owner.getFirstName() : "none");
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Stable getStable() {
		return stable;
	}

	public Owner getOwner() {
		return owner;
	}

	public ColorEnum getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setStable(Stable stable) {
		if (this.stable == stable)
			return;
		this.stable = stable;
		if (this.stable == null)
			return;
		this.stable.addDragon(this);
	}

	public void setOwner(Owner owner) {
		if (this.owner == owner)
			return;
		this.owner = owner;
		if (this.owner == null)
			return;
		this.owner.buyDragon(this);
	}
	
	public void setColor(ColorEnum color) {
		this.color = color;
	}
}
