package Corporation;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	private int					idCount;
	private String				name;
	private ArrayList<Employee>	employees;

	public Company() {
		this("Evil Corporation");
	}
	
	public Company(String name) {
		this.setName(name);
		this.setIdCount(0);
		this.employees = new ArrayList<Employee>();
	}

	private void setIdCount(int idCount) {
		this.idCount = idCount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	public int recruit(Employee newbie) {
		Iterator<Employee>	it;
		Employee			guy;
		
		it = this.employees.iterator();
		while (it.hasNext()) {
			guy = it.next();
			if (guy.equals(newbie))
				return guy.getId();
		}
		this.employees.add(newbie);
		newbie.setCompany(this);
		this.setIdCount(this.idCount + 1);
		return this.idCount;
	}
	
	public void fire(Employee oldie) {
		Iterator<Employee>	it;
		Employee			guy;
		
		it = this.employees.iterator();
		while (it.hasNext()) {
			guy = it.next();
			if (guy.equals(oldie)) {
				it.remove();
				this.setIdCount(this.idCount - 1);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
