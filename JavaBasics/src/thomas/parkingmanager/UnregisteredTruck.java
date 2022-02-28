package thomas.parkingmanager;

public final class UnregisteredTruck extends Truck implements TollGatePayable {

	public UnregisteredTruck(String brand, String plate) {
		super(brand, plate);
	}

	@Override
	public int payTollGate() {
		return 5;
	}
	
}
