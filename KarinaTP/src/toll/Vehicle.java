package toll;

public abstract class Vehicle {
	private static int		count = 0;
	private long			id;
	private String			brand;
	private String			plate;
	
	public Vehicle(String brand, String plate) {
		this.setId(Vehicle.getCount());
		Vehicle.incrementCount();
		this.brand = brand;
		this.plate = plate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [id=");
		builder.append(id);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", plate=");
		builder.append(plate);
		builder.append("]");
		return builder.toString();
	}

	public static void incrementCount() {
		Vehicle.count++;
	}
	
	public static int getCount() {
		return Vehicle.count;
	}
	
	public long getId() {
		return id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPlate(String plate) {
		this.plate = plate;
	}

	@SuppressWarnings("unused")
	private static void setCount(int count) {
		if (count < 0)
			return;
		Vehicle.count = 0;
	}
}
