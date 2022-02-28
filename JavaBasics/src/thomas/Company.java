package thomas;

public class Company {
	
	private String name;

	public Company(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
