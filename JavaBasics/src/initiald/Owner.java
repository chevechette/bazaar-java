package initiald;

import java.util.ArrayList;

public class Owner {
	String				firstName;
	String				lastName;
	ArrayList<Vehicule>	vehicles;
	
	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.vehicles = new ArrayList<Vehicule>();
	}

	public long countByBrand(String brand) {
		return this.vehicles.stream().filter(vehicle -> vehicle.getBrand() == brand).count();
	}
	
	public void add(Vehicule v) {
		if (this.vehicles.contains(v))
			return;
		this.vehicles.add(v);
	}
}
