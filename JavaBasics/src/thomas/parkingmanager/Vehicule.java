package thomas.parkingmanager;

public abstract class Vehicule {
	
	private static int count; // 2
	private long id;
	private String brand;
	private String plate;
	
	public Vehicule(String brand, String plate) {
		this.id = ++count;
		this.brand = brand;
		this.plate = plate;
		System.out.println("Création d'une " + brand + " avec l'id: "+this.getId());

	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicule.count = count;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public long getId() {
		return id;
	}
	
	
}
