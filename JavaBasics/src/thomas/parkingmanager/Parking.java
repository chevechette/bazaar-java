package thomas.parkingmanager;

import java.util.ArrayList;
import java.util.HashMap;

public class Parking {
	
	private String code;
	protected String name;
	private HashMap<String, Vehicule> vehicles = new HashMap<>();
	
	public Parking(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public int calculateTotalPrice() {
		return this.vehicles.values().stream()
			.filter(v -> v instanceof TollGatePayable)
			.mapToInt(v -> ((TollGatePayable)v).payTollGate())
			.sum();
	}
	
	public HashMap<String, Vehicule> getVehicles() {
		return vehicles;
	}

	public void add(Vehicule vehicule) {
		this.vehicles.put(vehicule.getPlate(), vehicule);
	}
}
