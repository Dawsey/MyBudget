package model;


public abstract class Transaction {
	
	protected String date;
	protected String amount;
        protected String currency;
        protected String category;

	
	public Transaction(String date, String amount, String currency, String category) {
		this.date = date;
		this.amount = amount;
                this.currency = currency;
                this.category = category;
				
	}
	
	public void setTransactionAmount(String amount) {
		this.amount = amount;
	}
	public void setTransactionDate(String date) {
		this.date = date;
	}
	
	public abstract String getTransactionAmount();
	
	public String getTransactionDate() {
		return date;
	}
	
	
	
}
