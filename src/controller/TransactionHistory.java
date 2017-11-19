package controller;
import java.util.ArrayList;
import java.util.List;

import model.Expense;
import model.Income;
import model.Transaction;

public class TransactionHistory {

	private List<Transaction> transactions = new ArrayList<Transaction>();
	double balance=0; 
	
	public TransactionHistory() {
		
	}
	
	public TransactionHistory(double balance, Transaction t) {
		this.balance = balance;
	}
	
	public void addTransaction(Transaction t) {
		transactions.add(t);		
	}
	
	public double calculateBalance() {
		double balance = 0;
		for(Transaction t: transactions) {
			balance += t.getTransactionAmount();		
		}
		return balance;
	}
	
		

	


	
	
	
	
	
	
	
	
	
}
