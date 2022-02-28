package thomas.animals;

import java.util.ArrayList;
import java.util.List;

import thomas.bazar.Car;

public class SingleParking {
	
	private List<Car> cars = new ArrayList<>();
	private int index;
	private static SingleParking instance; //
	
	private SingleParking() {} //
	
	public static SingleParking getInstance() { //
		if(instance == null) {
			instance = new SingleParking();
		}
		return instance;
	}
	
	public void add(Car c) {
		this.index++;
		this.cars.add(c);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SingleParking [cars=");
		builder.append(cars);
		builder.append(", index=");
		builder.append(index);
		builder.append("]");
		return builder.toString();
	}
	
	

}
