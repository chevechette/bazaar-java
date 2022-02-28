package thomas.bazar;

public class Loup extends Animal{

	public Loup(int age) {
		super(age);
	}

	//@Override
	public void manger() {
		System.out.println("Le loup mange une belle entrecote");
	}
	
	public void transform() {
		System.out.println("graouuuu, je me transforme");
	}

}
