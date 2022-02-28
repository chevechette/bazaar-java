package thomas.bazar;

import thomas.parkingmanager.Repas;

public class Cheval<T> extends Animal {

	public T nourriture;
		
	public Cheval(int age) {
		super(age);
	}

	public void manger(T nourriture) {
		//nourriture.manger();
	}
	public void equip(T nourriture) {
	
		this.nourriture = nourriture;
	}
	public void hennit() {
		System.out.println("huuuuuuuuuu");

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheval [poid=");
		builder.append(this.getPoid());
		builder.append(", age=");
		builder.append(this.getAge());
		builder.append("]");
		return builder.toString();
	}


}
