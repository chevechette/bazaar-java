package thomas;

public class BankInfo {
	
	private String number;
	private String bankName;
	
	public BankInfo(String number, String bankName) {
		super();
		this.number = number;
		this.bankName = bankName;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	
	
}
