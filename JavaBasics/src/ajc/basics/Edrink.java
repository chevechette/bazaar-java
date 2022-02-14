package ajc.basics;

public enum Edrink {
	TEA(2.50), COFFEE(0.7), VODKA(10), LIMONADE(5);
	
	public double	price;
	
	private Edrink(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
