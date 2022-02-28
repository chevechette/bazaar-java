package thomas.printer;

public class Printer {
	
	private String model;

	public Printer(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Printer [model=");
		builder.append(model);
		builder.append("]");
		return builder.toString();
	}
	
	
}
