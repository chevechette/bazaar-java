package ajc.basics;

public class Commande {
	private String		name;
	private Edrink		drink;
	private Emeal		mainCourse;
	private Edessert	dessert;
	
	public Commande(String name, Edrink drink, Emeal mainCourse, Edessert dessert) {
		this.setName(name);
		this.setMainCourse(mainCourse);
		this.setDrink(drink);
		this.setDessert(dessert);
	}
	
	public double	getPrixTotal() {
		double		check;
		
		check = 0;
		check += this.drink.getPrice();
		check += this.mainCourse.getPrice();
		check += this.dessert.getPrice();
		
		return check;
	}

	@Override
	public String toString() {
		return "Commande [name=" + name + ", drink=" + drink + ", mainCourse=" + mainCourse + ", dessert=" + dessert
				+ "]";
	}

	public String getName() {
		return name;
	}

	public Edrink getDrink() {
		return drink;
	}

	public Emeal getMainCourse() {
		return mainCourse;
	}

	public Edessert getDessert() {
		return dessert;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDrink(Edrink drink) {
		this.drink = drink;
	}

	public void setMainCourse(Emeal mainCourse) {
		this.mainCourse = mainCourse;
	}

	public void setDessert(Edessert dessert) {
		this.dessert = dessert;
	}
}
