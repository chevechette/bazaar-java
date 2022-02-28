package thomas.animals;

import thomas.bazar.Car;

public class PCControl {
	private String name;
	private SingleParking parking;
	
	public PCControl(String name, SingleParking parking) {
		super();
		this.name = name;
		this.parking = parking;
	}
	
	public void carEnter(Car c) {
		this.parking.add(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SingleParking getParking() {
		return parking;
	}

	public void setParking(SingleParking parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PCControl [name=");
		builder.append(name);
		builder.append(", parking=");
		builder.append(parking);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
