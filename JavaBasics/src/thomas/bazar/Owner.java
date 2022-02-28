package thomas.bazar;

import java.util.ArrayList;
import java.util.List;

public class Owner {
	private List<Vehicule> vehicles = new ArrayList<Vehicule>();
	
	public void add(Vehicule v) {
		this.vehicles.add(v);
	}

	public int countByBrand(String brand) {
		return (int) vehicles.stream().filter(v -> v.brand.equals(brand)).count();
	}
	
	public List<Vehicule> getVehicles() {
		return vehicles;
	}
	
	
	
}
