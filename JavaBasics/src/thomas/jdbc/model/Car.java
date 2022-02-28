package thomas.jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Car {

	private int id;
	private String model;
	private String color;
	
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	
}
