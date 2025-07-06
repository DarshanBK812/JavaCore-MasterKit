package oop_Design_Oriented_Scenarios.banking_system;

public class Account extends Bank {

	private int accountId;
	private String accountHolderName;

	public Account(int bankId, String bankName, String accountType, int acountBal, int accountId,
			String accountHolderName) {
		super(bankId, bankName, accountType, acountBal);
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;

	}

	@Override
	public void createAccount() {
		// account is created for name ,
		System.out.println("account is created for " + accountHolderName + " accountType" + getAccountType()
				+ " in the bank" + getBankName());
	}

	@Override
	public void cancelAccount() {

	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

}
