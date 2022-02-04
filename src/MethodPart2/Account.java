package MethodPart2;

public class Account {


	
	String accountOwnerName = "";
	double balance;

	// Return Type methodName()
	String getAccountOwnerName() {
		// return statement
		return accountOwnerName;
	}

	double getbalance() {
		return balance;
		// set
	}

	void setAccountOwnerName(String name) {
		accountOwnerName = name;
	}

	void setBalance(double bal) {
		balance = balance + bal;
	}

	// return type method with datatype(Here we initialize at same type)
	double withDrawMoney(double amountToBeWithdrawn) {
		balance = balance - amountToBeWithdrawn;
		return balance;
	}
}
