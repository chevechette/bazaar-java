package ajc.basics;

import java.util.ArrayList;

public class Bestiary<T extends Animal> {
	private String			adress;
	private	ArrayList<T>	animals;

	public Bestiary(String adress) {
		this.setAdress(adress);
		this.setAnimals(new ArrayList<T>());
	}
	
	public void add(T animal) {
		this.animals.add(animal);
	}

	public String getAdress() {
		return adress;
	}

	public ArrayList<T> getAnimals() {
		return animals;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setAnimals(ArrayList<T> animals) {
		this.animals = animals;
	}
	
	
}
