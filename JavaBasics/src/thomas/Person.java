package thomas;

import java.util.ArrayList;

public class Person {
	
	private String name;
	private int age;
	private Car car;


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Car getCar() {
		return car;
	}

 
	public void setCar(Car car) {
		this.car = car;
		car.setOwner(this);
	}
	
	
	

}
