package initiald;

public abstract class Vehicule {
	private	int			engine;
	protected String	brand;
	
	public Vehicule() {
		this(0, "Generic");
	}
	
	public Vehicule(int engine, String brand) {
		this.setEngine(engine);
		this.setBrand(brand);
	}
	
	public abstract void start();
	
	public abstract void stop();
	
	public final void displayEngine() {
		System.out.println("Engine exists");
	}
	
	public int getEngine() {
		return engine;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setEngine(int engine) {
		this.engine = engine;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
