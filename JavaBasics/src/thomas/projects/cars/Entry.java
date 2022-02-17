package thomas.projects.cars;

public class Entry {

	public static void main(String[] args) {
		
		Car c1 = null;
		try {
			c1 = new Car(230, new CarInfo("1111", "Peugeot"));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println(c1);
	}

}
