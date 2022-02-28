package thomas.bazar;

public abstract class Vehicule {
	
	private int engine;
	protected String brand;
	
	public abstract void start();
	public abstract void stop() throws CantLandException;
	
	public Vehicule(String brand) {
		this.brand = brand;
	}
	
	public final void displayEngine() {
		System.out.println("Engine: " + engine);
	}
}
