package thomas;

public class Car {
	private String		color;
	private String		model;
	private int			year;
	private Person		owner;

	public Car(String color, String model, int year) {
		this.setColor(color);
		this.setModel(model);
		this.setYear(year);
	}
	
	

	public Car(String color, String model, int year, Person owner) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.owner = owner;
	}



	public Car(String color) {
		this.setColor(color);
		this.setModel(null);
		this.setYear(2002);
	}
	
	
	public void		displayInfos() {
		System.out.println(this.toString());
	}

	@Override
	public String	toString() {
		return ("This is a " +
				this.color + " " + this.model + " from " +
				this.year + " !");
	}
	
	public String	getColor() {
		return this.color;
	}
	
	public String	getModel() {
		return this.model;
	}
	
	public int		getYear() {
		return this.year;
	}
	
	public void		setColor(String color) {
		this.color = (color == null) ? "red" : color;
	}
	
	public void		setModel(String model) {
		this.model = (model == null) ? "Peugot": model;
	}
	
	public void		setYear(int year) {
		this.year = year;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
		owner.setCar(this);

	}
}
