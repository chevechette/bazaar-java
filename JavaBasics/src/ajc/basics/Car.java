package ajc.basics;

public class Car {
	public String		color;
	public String		model;
	public int			year;
	
	public Car() {
		
	}
	
	public Car(String color, String model, int year) {
		this.color = color;
		this.model = model;
		this.year = year;
	}
	
	public void displayInfos() {
		if (this.color == null || this.model == null) {
			System.out.println("I ain't telling you shit !");
			return;
		}
		System.out.println("This is a " +
				this.color + " " + this.model + " from " +
				this.year + " !");
	}
}
