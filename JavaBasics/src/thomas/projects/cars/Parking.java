package thomas.projects.cars;

import java.util.ArrayList;

public class Parking {
	
	private String name;
	private String city;
	private String address;
	private ArrayList<Car> cars = new ArrayList<>();
	
	
	public Parking(String name, String city, String address) {
		this.name = name;
		this.city = city;
		this.address = address;
	}
	
	public int countByBrand(String brand) {
		return (int) this.cars.stream()
				.filter(c -> c.getCarInfo().getBrand().equals(brand))
				.count();
	}
	
	public void add(Car c) {
		this.cars.add(c);
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parking [name=");
		builder.append(name);
		builder.append(", city=");
		builder.append(city);
		builder.append(", address=");
		builder.append(address);
		builder.append(", cars=");
		builder.append(cars);
		builder.append("]");
		return builder.toString();
	}

}
