package controller;
import model.Expense;
import model.Income;
import model.Transaction;

public class TransactionFactory {
	public static Transaction getTransaction(String type, double amount, String formattedDate, String category) {
		if("expense".equalsIgnoreCase(type)) return new Expense(amount, formattedDate, category);
		else if("income".equalsIgnoreCase(type)) return new Income(amount, formattedDate, category);
		return null;
		
		
	}
}
