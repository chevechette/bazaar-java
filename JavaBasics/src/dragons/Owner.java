package dragons;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Owner {
	private String			firstName;
	private String			lastName;
	private LocalDate		birthDate;
	private String			city;
	
	private Set<Dragon>		dragons;
	
	public Owner(String firstname, String lastName, LocalDate birthDate, String city) {
		this.setFirstName(firstname);
		this.setLastName(lastName);
		this.setBirthDate(birthDate);
		this.setCity(city);
		this.setDragons(null);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", city=");
		builder.append(city);
		builder.append(", dragons=");
		builder.append(dragons);
		builder.append("]");
		return builder.toString();
	}
	
	public void buyDragon(Dragon drake) {
		if (drake == null || this.dragons.contains(drake))
			return;
		this.dragons.add(drake);
		drake.setOwner(this);
	}
	
	public void sellDragon(Dragon drake) {
		if (drake == null || !this.dragons.contains(drake))
			return;
		this.dragons.remove(drake);
		drake.setOwner(null);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getCity() {
		return city;
	}

	public Set<Dragon> getDragons() {
		return dragons;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private void setDragons(Set<Dragon> dragons) {
		this.dragons = dragons;
		if (this.dragons == null)
			this.dragons = new HashSet<Dragon>();
	}
}
