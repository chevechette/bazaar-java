package thomas;

import java.time.LocalDate;

public class Horse {
	
	private String name;
	private LocalDate birthDate;
	private Color color;
	private Owner owner;
	
	public Horse(String name, LocalDate birthDate, Color color, Owner owner) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.color = color;
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Horse [name=");
		builder.append(name);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", color=");
		builder.append(color);
		builder.append(", owner=");
		builder.append(owner);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
