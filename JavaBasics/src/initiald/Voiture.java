package initiald;

public class Voiture extends Vehicule {

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(int engine, String brand) {
		super(engine, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car");

	}
	
	
}
