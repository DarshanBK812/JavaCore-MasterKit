package oop_Design_Oriented_Scenarios_problems.banking_system;

public abstract class Bank {

	private int bankId;
	private String bankName;
	private String accountType;
	private int bankBalance;

	public Bank(int bankId, String bankName, String accountType, int bankBal) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.accountType = accountType;
		bankBalance = bankBal;
	}

	public abstract void createAccount();

	public abstract void cancelAccount();

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", accountType=" + accountType + ", bankBalance="
				+ bankBalance + "]";
	}

}
