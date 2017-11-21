package model;

public class Income extends Transaction{

	public Income(String date, String amount, String currency, String category) {
		super(date, amount, currency, category);
	}

	@Override
	public String getTransactionAmount() {
		return amount;
	}

	
}
