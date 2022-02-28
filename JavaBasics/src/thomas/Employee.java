package thomas;

import java.util.ArrayList;

public class Employee {
	
	private static int count = 1;
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	private Status status;
	private BankInfo bankInfo;
	private Company company;
	private ArrayList<Job> jobs = new ArrayList<Job>();
	
	public Employee(String firstName, String lastName, double salary, Status status, BankInfo bankInfo,
			Company company) {
		this.id = count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.status = status;
		this.bankInfo = bankInfo;
		this.company = company;
	}
	public Employee() {
	
	}
	
	public void addJob(Job j) {
		this.jobs.add(j);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public BankInfo getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Job> getJobs() {
		return jobs;
	}
	public void setJobs(ArrayList<Job> jobs) {
		this.jobs = jobs;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", status=");
		builder.append(status);
		builder.append(", bankInfo=");
		builder.append(bankInfo);
		builder.append(", company=");
		builder.append(company);
		builder.append("]");
		return builder.toString();
	}
	
	
}
