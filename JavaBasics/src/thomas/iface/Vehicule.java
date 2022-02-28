package thomas.iface;

public class Vehicule {
	
	private String model;

	public Vehicule(String model) {
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
		builder.append("Vehicule [model=");
		builder.append(model);
		builder.append("]");
		return builder.toString();
	}
	
}
