package model;

public class Expense extends Transaction{

	public Expense(double amount, String formattedDate, String category) {
		super(amount, formattedDate, category);	
	}

	@Override
	public double getTransactionAmount() {
		return -amount;
	}

}
