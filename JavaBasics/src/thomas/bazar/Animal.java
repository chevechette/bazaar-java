package thomas.bazar;

public abstract class Animal {
	private int poid = 20;
	private int age;
	
	public Animal(int age) {
		super();
		this.age = age;
	}
	//public abstract void manger(T nourriture);

	public void sayAge() {
		System.out.println("J'ai " + age + " ans");
	}
	
	
	
	public int getPoid() {
		return poid;
	}
	public void setPoid(int poid) {
		this.poid = poid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [poid=");
		builder.append(poid);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	
}
