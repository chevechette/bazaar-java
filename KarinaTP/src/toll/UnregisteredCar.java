package toll;

public final class UnregisteredCar extends Car implements TollGatePayable {
	private static final int		tollPrice = 3;

	public UnregisteredCar(String brand, String plate) {
		super(brand, plate);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Unregistered Car ");
		builder.append(this.getBrand());
		builder.append(" created with id: ");
		builder.append(this.getId());
		System.out.println(builder.toString());

	}

	@Override
	public int payTollGate() {
		return UnregisteredCar.tollPrice;
	}
}
