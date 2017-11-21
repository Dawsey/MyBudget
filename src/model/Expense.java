package model;

public class Expense extends Transaction{

	public Expense(String date, String amount, String currency, String category) {
		super(date, amount, currency, category);
	}

	@Override
	public String getTransactionAmount() {
		return "-" + amount;
	}

}
