package Corporation;

public class Employee {
	private String		firstname;
	private String		lastname;
	double				salary;
	private Status		status;
	private BankInfo	bankInfo;
	
	public Employee(String firstname, String lastname, double salary,
					Company company, BankInfo bank, Status status) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setSalary(salary);
		this.setStatus(status);
		this.setBankInfo(bank);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", status=");
		builder.append(status);
		builder.append(", bankInfo=");
		builder.append(bankInfo);
		builder.append("]");
		return builder.toString();
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public double getSalary() {
		return salary;
	}

	public Status getStatus() {
		return status;
	}

	public BankInfo getBankInfo() {
		return bankInfo;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}
}
