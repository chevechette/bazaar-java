package ajc.basics;

public enum Emeal {
	BORSCH(25.4);
	
	public double	price;
	
	private Emeal(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
