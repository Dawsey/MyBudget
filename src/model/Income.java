package model;

public class Income extends Transaction{

	public Income(double amount, String formattedDate, String category) {
		super(amount, formattedDate, category);
	}

	@Override
	public double getTransactionAmount() {
		return amount;
	}

	
}
