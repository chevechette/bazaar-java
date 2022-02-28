package thomas.parkingmanager;

public class Entry {

	public static void main(String[] args) {
		Parking p = new Parking("TP", "THE parking");
		int a = 10;
		int b = a++;
		
		System.out.println(b);	
		
		p.add(new RegisteredCar("Peugeot", "444444"));
		p.add(new UnregisteredCar("Peugeot", "444444"));
		p.add(new UnregisteredCar("Peugeot", "444444"));
		p.add(new RegisteredTruck("Peugeot", "444444"));
		p.add(new UnregisteredTruck("Peugeot", "444444"));
		p.add(new RegisteredTruck("Renault", "444444"));
		
		System.out.println(p.getVehicles().size());
		System.out.println(p.getVehicles().values());
		
		
		System.out.println(p.calculateTotalPrice());
	}

}