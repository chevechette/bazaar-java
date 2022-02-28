package thomas.parkingmanager;

public final class UnregisteredCar extends Car implements TollGatePayable {

	public UnregisteredCar(String brand, String plate) {
		super(brand, plate);
	}

	@Override
	public int payTollGate() {
		return 3;
	}
	
}
