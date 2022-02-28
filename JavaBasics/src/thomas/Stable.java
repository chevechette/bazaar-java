package thomas;

import java.util.ArrayList;

public class Stable {
	
	private String name;
	private String city;
	private ArrayList<Horse> horses = new ArrayList<>();
	
	public Stable(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	public void addHorse(Horse h) {
		this.horses.add(h);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<Horse> getHorses() {
		return horses;
	}

	public void setHorses(ArrayList<Horse> horses) {
		this.horses = horses;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stable [name=");
		builder.append(name);
		builder.append(", city=");
		builder.append(city);
		builder.append(", horses=");
		builder.append(horses);
		builder.append("]");
		return builder.toString();
	}
	
}
