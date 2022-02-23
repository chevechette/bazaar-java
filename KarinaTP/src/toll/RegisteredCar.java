package toll;

public final class RegisteredCar extends Car {

	public RegisteredCar(String brand, String plate) {
		super(brand, plate);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Registered Car ");
		builder.append(this.getBrand());
		builder.append(" created with id: ");
		builder.append(this.getId());
		System.out.println(builder.toString());

	}

}
