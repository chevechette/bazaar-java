package Corporation;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	private String				name;
	private ArrayList<Employee>	employees;

	public Company() {
		this("Evil Corporation");
	}
	
	public Company(String name) {
		this.setName(name);
		this.employees = new ArrayList<Employee>();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	public void recruit(Employee newbie) {
		Iterator<Employee>	it;
		Employee			guy;
		
		it = this.employees.iterator();
		while (it.hasNext()) {
			guy = it.next();
			if (guy.equals(newbie))
				return;
		}
		this.employees.add(newbie);
		newbie.setCompany(this);
	}
	
	public void fire(Employee oldie) {
		Iterator<Employee>	it;
		Employee			guy;
		
		it = this.employees.iterator();
		while (it.hasNext()) {
			guy = it.next();
			if (guy.equals(oldie))
				it.remove();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
