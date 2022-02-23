package toll;

public final class UnregisteredTruck extends Truck implements TollGatePayable {
	private static final int		tollPrice = 5;


	public UnregisteredTruck(String brand, String plate) {
		super(brand, plate);

		StringBuilder builder = new StringBuilder();
		builder.append("Unregistered Truck ");
		builder.append(this.getBrand());
		builder.append(" created with id: ");
		builder.append(this.getId());
		System.out.println(builder.toString());
	}
	
	@Override
	public int payTollGate() {
		return UnregisteredTruck.tollPrice;
	}
}
