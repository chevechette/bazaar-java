package initiald;

import java.util.ArrayList;
import java.util.Iterator;

public class Parking {
	private String			name;
	private String			city;
	private String			address;
	
	ArrayList<Car>			parkedCars;
	
	public Parking(String name, String city, String address) {
		this.parkedCars = new ArrayList<Car>();
		this.setName(name);
		this.setCity(city);
		this.setAddress(address);
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
		builder.append(", car=");
		//builder.append(car);
		builder.append("]");
		return builder.toString();
	}
	
	public void addCar(Car car) {
		// Add exception ?
		Iterator<Car>	it;
		Car				parked;
		
		it = this.parkedCars.iterator();
		while (it.hasNext()) {
			parked = (Car) it.next();
			if (parked.equals(car))
				return;
		}
		this.parkedCars.add(car);
		car.setParking(this);
	}
	
	public void removeCar(Car car) {
		Iterator<Car>	it;
		Car				parked;
		
		it = this.parkedCars.iterator();
		while (it.hasNext()) {
			parked = (Car) it.next();
			if (parked.equals(car)) {
				car.setParking(null);
				it.remove();
			}
		}
	}
	
	public int countByBrand(String brand) {
		int				cnt;
		Iterator<Car>	it;
		Car				car;
		
		cnt = 0;
		it = this.parkedCars.iterator();
		while (it.hasNext()) {
			car = (Car) it.next();
			if (brand.equals(car.getSpecs().getBrand()))
				cnt++;
		}
		return cnt;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}

	public ArrayList<Car> getParkedCars() {
		return parkedCars;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setParkedCars(ArrayList<Car> parkedCars) throws NullPointerException {
		if (parkedCars == null)
			throw new NullPointerException();
		this.parkedCars = parkedCars;
	}
}
