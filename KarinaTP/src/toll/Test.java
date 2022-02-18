package toll;

public class Test {
	public static void main(String[] args) {
		Parking		park;
		
		park = new Parking("Code", "string");
		try {
			park.add(new RegisteredCar("Peugeot", "ROXOR"));
			park.add(new RegisteredCar("Peugeot", "ROXOR"));
			park.add(new UnregisteredCar("Peugeot", "ROXOR"));
			park.add(new UnregisteredCar("Peugeot", "ROXOR"));
			park.add(new RegisteredTruck("Peugeot", "ROXOR"));
			park.add(new RegisteredTruck("Peugeot", "ROXOR"));
			park.add(new UnregisteredTruck("Peugeot", "ROXOR"));
			park.add(new UnregisteredTruck("Peugeot", "ROXOR"));
			
			park.calculateTotalPrice();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
