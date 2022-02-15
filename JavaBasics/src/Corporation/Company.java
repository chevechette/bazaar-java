package Corporation;

public class Company {
	private String	name;

	public Company() {
		this("Evil Corporation");
	}
	
	public Company(String name) {
		this.setName(name);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
