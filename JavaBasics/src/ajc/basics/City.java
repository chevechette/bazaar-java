package ajc.basics;

public class City {
	private String		name;
	private String		country;
	private double		population;
	private String		category;
	private boolean		capital;
	
	public City(String name, String country, double population, boolean capital) {
		this.setName(name);
		this.setCountry(country);
		this.setPopulation(population);
		this.setCapital(capital);
	}
	
	public String	makeCompare(City c) {
		String		comparator;
		
		if (this.population > c.population) {
			comparator = "bigger than";
		} else if (this.population < c.population) {
			comparator = "smaller than";
		} else {
			comparator = "equals to";
		}
		return(String.format("City %s is %s City %s", this.name, comparator, c.name));
	}

	private void		updateCategory() {
		if (this.population < 6 || (this.capital && this.population <= 7)) {
			this.category = "Small";
		} else {
			this.category = "Big";
		}
	}

	@Override
	public String		toString() {
		return String.format("%s is a %s %s that houses a population of %f million (human).",
					this.name, this.category, this.capital ? "capital" : "city", this.population);
	}

	public String		getName() {
		return name;
	}

	public String		getCountry() {
		return country;
	}

	public double		getPopulation() {
		return population;
	}

	public String		getCategory() {
		return category;
	}

	public boolean		isCapital() {
		return capital;
	}

	public void			setName(String name) {
		this.name = name;
	}

	public void			setCountry(String country) {
		this.country = country;
	}

	public void			setPopulation(double population) {
		this.population = population;
		this.updateCategory();
	}

	public void			setCapital(boolean capital) {
		this.capital = capital;
	}
}
