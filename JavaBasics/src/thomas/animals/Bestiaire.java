package thomas.animals;

import java.util.ArrayList;
import java.util.List;

public class Bestiaire<T extends Animal> {
	
	private String address;
	private List<T> animals = new ArrayList<>();
	
	public Bestiaire(String address) {
		super();
		this.address = address;
	}
	
	public void add(T animal) {
		this.animals.add(animal);
	}
	
}
