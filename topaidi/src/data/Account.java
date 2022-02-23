package data;

public abstract class Account {
	static private int		id = 0;
	private int				accountId;
	private String			email;
	private String			password;
	private boolean			active;
	
	public Account(String email, String password, boolean active) {
		this.accountId = Account.id++;
		this.email = email;
		this.password = password;
		this.active = active;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public boolean isActive() {
		return active;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accountId=");
		builder.append(accountId);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}

}
