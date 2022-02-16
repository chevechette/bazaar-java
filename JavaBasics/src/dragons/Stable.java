package dragons;

import java.util.HashSet;
import java.util.Set;

public class Stable {
	private String				name;
	private String				city;
	private Set<Dragon>			herd;
	
	public Stable() {
		this("Tunnel Dragons", "MidWest City", null);
	}
	
	public Stable(String name, String city) {
		this(name, city, null);
	}
	
	public Stable(String name, String city, Set<Dragon> herd) {
		this.setCity(city);
		this.setName(name);
		this.setHerd(herd);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stable [name=");
		builder.append(name);
		builder.append(", city=");
		builder.append(city);
		builder.append(", herd=");
		builder.append(herd);
		builder.append("]");
		return builder.toString();
	}

	public void addDragon(Dragon drake) {
		if (drake == null || this.herd.contains(drake))
			return;
		this.herd.add(drake);
		drake.setStable(this);
	}
	
	public void removeDragon(Dragon drake) {
		if (drake == null || !this.herd.contains(drake))
			return;
		this.herd.remove(drake);
		drake.setStable(null);
	}
	
	public Set<Dragon> getHerd() {
		return herd;
	}
	
	private void setHerd(Set<Dragon> herd) {
		this.herd = herd;
		if (this.herd == null) {
			this.herd = new HashSet<>();
		}
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
