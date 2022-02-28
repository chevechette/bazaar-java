package thomas.bazar;

public class Car extends Vehicule{

	public static final float TAUX_POLLUTION = 2.57f; 
	
	public Car(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("La voiture démarre");
	}

	@Override
	public void stop() {
		System.out.println("La voiture s'arrete");
	}
	
	
}
