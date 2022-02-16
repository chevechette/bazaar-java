package Corporation;

public class BankInfo {
	private String		number;
	private String		bankName;
	private Employee	owner;
	
	public BankInfo(String number, String name) {
		this.setBankName(name);
		this.setNumber(number);
		this.owner = null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankInfo [number=");
		builder.append(number);
		builder.append(", bankName=");
		builder.append(bankName);
		builder.append("]");
		return builder.toString();
	}

	public Employee getOwner() {
		return owner;
	}

	public void setOwner(Employee owner) {
		if (this.owner == null || !this.owner.equals(owner)) {
			this.owner = owner;
			this.owner.setBankInfo(this);
		}
	}

	public String getNumber() {
		return number;
	}

	public String getBankName() {
		return bankName;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
