package toll;

import java.util.ArrayList;

public class Parking {
	private String				code;
	private String				name;
	
	private ArrayList<Vehicle>	parkedVehicles;

	public Parking(String code, String name) {
		this.code = code;
		this.name = name;
		this.parkedVehicles = new ArrayList<Vehicle>();
	}
	
	public void calculateTotalPrice() {
		long debtors = this.parkedVehicles.stream().filter(v -> v instanceof TollGatePayable).count();
		long sumFees = this.parkedVehicles.stream()
				.filter(v -> v instanceof TollGatePayable)
				.mapToInt(v -> ((TollGatePayable) v).payTollGate()).sum();
		
		System.out.println(debtors + " Vehicles, unregistered total cost is: " + sumFees + " EUR.");
	}
	
	public void add(Vehicle v) throws Exception {
		if (this.parkedVehicles.contains(v))
			throw new Exception("Already parked there !");
		this.parkedVehicles.add(v);
	}
	
	public void open() {
		
	}
	
	public void close() {
		
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
