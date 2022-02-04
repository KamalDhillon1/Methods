package MethodPart2;

public class MainClassAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mainClassAccountOwner = "";
		double mainClassbalance = 0;

		Account obj = new Account();
		obj.accountOwnerName = "Kamal";
		obj.balance = 200;

		mainClassAccountOwner = obj.accountOwnerName;
		mainClassbalance = obj.balance;
		System.out.println("Owner" + mainClassAccountOwner);
		System.out.println("Balance" + mainClassbalance);
		// Set
		obj.setAccountOwnerName("Dhillon");
		mainClassAccountOwner = obj.accountOwnerName;
		System.out.println("Updated owner" + mainClassAccountOwner);

		obj.setBalance(100);
		mainClassbalance = obj.balance;
		System.out.println("New balance" + mainClassbalance);

		double withDrawMoney = obj.withDrawMoney(150);
		System.out.println("Amount" + withDrawMoney);

	}

}
