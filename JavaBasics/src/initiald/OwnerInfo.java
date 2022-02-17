package initiald;

public class OwnerInfo {
	private String		firstName;
	private String		lastName;
	private Car			car = null;
	
	public OwnerInfo(String firstName, String lastName) {
		this(firstName, lastName, null);
	}
	
	public OwnerInfo(String firstName, String lastName, Car car) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setCar(car);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Car getCar() {
		return car;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCar(Car car) {
		if (this.car.equals(car))
			return;
		this.car = car;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OwnerInfo [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", car's Serial Number=");
		builder.append(car.getSpecs().getSerialNumber());
		builder.append("]");
		return builder.toString();
	}
}
