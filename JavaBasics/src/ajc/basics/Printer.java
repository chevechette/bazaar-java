package ajc.basics;

public class Printer {
	private String	name;
	private String	model;

	public Printer(String name, String model) {
		this.name = name;
		this.model = model;
	}
	
	public void print() {
		System.out.println("This printer " + this.getName() + " is printing.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Printer []");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
