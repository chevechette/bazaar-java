package thomas.iface;

public class Car extends Vehicule implements Roulant{
	
	public Car(String model) {
		super(model);
	}

	@Override
	public void rouler() {
		System.out.println("La voiture roule sur le bitume de la route");
	}
}
