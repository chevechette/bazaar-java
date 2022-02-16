package Corporation;

public class Status {
	private boolean		manager = false;
	private int			year = 0;
	private Employee	owner = null;
	
	public Status() {
		
	}
	
	public Status(int year) {
		this.setYear(year);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Status [manager=");
		builder.append(manager);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}
	
	public Employee getOwner() {
		return owner;
	}

	public void setOwner(Employee owner) {
		if (this.owner == null || !this.owner.equals(owner)) {
			this.owner = owner;
			this.owner.setStatus(this);
		}
	}

	public Status(boolean manager) {
		this.setManager(manager);
	}
	
	public Status(int year, boolean manager) {
		this.setManager(manager);
		this.setYear(year);
	}

	public boolean isManager() {
		return manager;
	}

	public int getYear() {
		return year;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
