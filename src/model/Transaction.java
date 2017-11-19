package model;


public abstract class Transaction {
	
	String formattedDate;
	public double amount;
        private String category;

	
	public Transaction(double amount, String formattedDate, String category) {
		this.formattedDate = formattedDate;
		this.amount = amount;
                this.category = category;
				
	}
	
	public void setTransactionAmount(double amount) {
		this.amount = amount;
	}
	public void setTransactionDate(String formattedDate) {
		this.formattedDate = formattedDate;
	}
	
	public abstract double getTransactionAmount();
	
	public String getTransactionDate() {
		return formattedDate;
	}
	
	
	
}
