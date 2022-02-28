package thomas.bazar;

public class Boat extends Vehicule{

	public Boat(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Le bateau démarre");
	}

	@Override
	public void stop() {
		System.out.println("Le bateau s'arrete");
	}

}
