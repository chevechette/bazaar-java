package toll;

public abstract class Car extends Vehicle {

	public Car(String brand, String plate) {
		super(brand, plate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [");
		builder.append("id=");
		builder.append(this.getId());
		builder.append(", brand=");
		builder.append(this.getBrand());
		builder.append(", plate=");
		builder.append(this.getPlate());
		builder.append("]");
		return builder.toString();
	}
	
	
}
