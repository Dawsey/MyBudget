package controller;
import model.Expense;
import model.Income;
import model.Transaction;

import java.util.ArrayList;

public class TransactionFactory {
    
    TransactionController tc;
    private static ArrayList<Transaction> tr; 
    private static String type; 
    
    
    public TransactionFactory(){
        tc = new TransactionController();
        tr = tc.getTrFromDB();  
        type = tc.getType();
    }
    
    public static Transaction getTransaction(String date, String amount, String currency, String category) { 
       
	if("expense".equalsIgnoreCase(type)) return new Expense(date, amount, currency, category);
	else if("income".equalsIgnoreCase(type)) return new Income(date, amount, currency, category);
	return null;
		
		
	}
}
