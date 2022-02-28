package thomas.animals;

public class Chat extends Animal{

	public Chat(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chat []");
		return builder.toString();
	}
	
	

}
