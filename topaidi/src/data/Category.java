package data;

public class Category {
	private String			name;
	private String			description;
	//private ArrayList<Idea>	ideas;
	
	public Category(String name, String description) {
		this.name = name;
		this.description = description;
		//this.ideas = new ArrayList<Idea>();
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
}
