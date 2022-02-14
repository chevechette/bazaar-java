package ajc.basics;

public enum Edessert {
	TIRAMISU(13.0);
	
	public double	price;
	
	private Edessert(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
