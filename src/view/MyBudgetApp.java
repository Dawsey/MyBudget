package view;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.TransactionFactory;
import controller.TransactionHistory;
import model.Transaction;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class MyBudgetApp {

   // fields
	TransactionHistory th = new TransactionHistory();
	static String formattedDate;
	public static final String[] transactionType = { "Income", "Expense" };

   
   // constructors

   // instance methods

   // Delegation to the model
   public void addTransaction(Transaction t) {
	   th.addTransaction(t);
   }
   
   public double calculateBalance() {
	   return th.calculateBalance();
   }
   

   public static void main(String[] args) {
	   
	   menu();

       // simulate the user interaction

       MyBudgetApp myapp = new MyBudgetApp();
       double balance = 0;

       //myapp.loadTransactions(); //from the database
       /*
       Transaction t1 = TransactionFactory.getTransaction("Income", 15000, formattedDate, "salary");
       balance = t1.amount; //setting the income to the balance at the beginning of the program.
       Transaction t2 = TransactionFactory.getTransaction("Expense", 1000, formattedDate, "rent");
       Transaction t3 = TransactionFactory.getTransaction("Income", 5000, formattedDate, "salary");
       Transaction t4 = TransactionFactory.getTransaction("Expense", 1000, formattedDate, "transportation");
       
       myapp.addTransaction(t1);
       myapp.calculateBalance();
       System.out.println(myapp.calculateBalance());
       myapp.addTransaction(t2);
       myapp.calculateBalance();
       System.out.println(myapp.calculateBalance());
       myapp.addTransaction(t3);
       myapp.calculateBalance();
       System.out.println(myapp.calculateBalance());
       myapp.addTransaction(t4);
       myapp.calculateBalance();
       System.out.println(myapp.calculateBalance());
       */
       //myapp.saveTransactions(); //save to the db
   }

   public static void menu() {
	   
	   MyBudgetApp myapp = new MyBudgetApp();

   }
   
}