package karina.jdbc;

import java.time.LocalDate;

public class Area {
	private int			id;
	private String		name;
	private LocalDate	createdOn;	
	
	public Area(int id, String name, LocalDate createdOn) {
		this.id = id;
		this.name = name;
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Area [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", createdOn=");
		builder.append(createdOn);
		builder.append("]");
		return builder.toString();
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	
	
}
