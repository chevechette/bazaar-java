package corporation;

public class Employee {
	private int			id;
	private String		firstname;
	private String		lastname;
	double				salary;
	private Status		status;
	private BankInfo	bankInfo;
	private Company		company;
	
	public Employee(String firstname, String lastname, double salary,
					Company company, BankInfo bank, Status status) {
		this.status = null;
		this.bankInfo = null;
		this.company = null;
		
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setSalary(salary);
		this.setStatus(status);
		this.setBankInfo(bank);
		this.setCompany(company);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append(", id=");
		builder.append(id);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", status=");
		builder.append(status);
		builder.append(", bankInfo=");
		builder.append(bankInfo);
		builder.append(", company=");
		builder.append(company.getName());
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

	public Company getCompany() {
		return company;
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
		if (this.status == null || !this.status.equals(status)) {
			this.status = status;
			this.status.setOwner(this);
		}
	}

	public void setBankInfo(BankInfo bankInfo) {
		if (this.bankInfo == null || !this.bankInfo.equals(bankInfo)) {
			this.bankInfo = bankInfo;
			this.bankInfo.setOwner(this);
		}
	}

	public void setCompany(Company company) {
		if (this.company == null || !this.company.equals(company)) {
			this.company = company;
			this.id = this.company.recruit(this);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
