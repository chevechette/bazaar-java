package initiald;

public class Test {
	public static void main(String[] args) {
		Voiture	car = new Voiture(13123, "Volvo");
		Avion	plane = new Avion(123, "Airbus");
		Owner	me = new Owner("Ellie", "Copter");
		
		car.start();
		plane.stop();
		car.displayEngine();
		me.add(car);
		me.add(plane);
		me.add(plane);
		System.out.println(me.countByBrand("Airbus"));
	}
}
