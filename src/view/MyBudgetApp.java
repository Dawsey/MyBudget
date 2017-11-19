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

       //myapp.saveTransactions(); //save to the db
   }

   public static void menu() {
	   
	   MyBudgetApp myapp = new MyBudgetApp();

	     JFrame frame = new JFrame("Input Dialog Example 3");
	     String userTransaction = (String) JOptionPane.showInputDialog(frame, 
	         "Enter new transaction",
	         "Transaction Type",
	         JOptionPane.QUESTION_MESSAGE, 
	         null, 
	         transactionType, 
	         transactionType[0]);

	     // transactionType will be null if the user clicks Cancel
	     System.out.printf("The transaction type is %s.\n", transactionType);
	     //System.exit(0);
	   
	   
	   String menu = "Keep track of your budget\n "
               + "1.Add a new Income \n "
               + "2.Add a new Expense \n "
               + "3.Add a date for Income \n "
               + "4.Add a date for Expense \n "
               + "5.View your transactions \n "
               + "6.View your balance \n "
               + "7.Empty your transaction history\n "
               + "8.Exit the program";
	   
	   int choice = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
	   
	   JTextField type = new JTextField();
	   JTextField amount = new JTextField();
       JTextField tdate = new JTextField();
       JTextField currency = new JTextField();

       Object[] message = {"Enter Transaction Type (Income or Expense): ", type, 
    		   					"Enter Transaction Amount: ", amount,
    		   						"Enter date for your transaction (dd/mm/yyyy): ", tdate, 
    		   							"Enter currency: ", currency};
       int test = JOptionPane.showConfirmDialog(null, message);
       
       DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
       LocalDate ld = LocalDate.parse(tdate.getText(), f);
       formattedDate = ld.format(f);
       System.out.println("the date: " + formattedDate);
       
       double tAmount = Double.parseDouble(amount.getText());

       while(choice != 8) {
    	   		switch(choice) {
    	   			case 1: 
    	   			case 2:
    	   			case 3:
    	   			case 4:
    	   				Transaction t1 = TransactionFactory.getTransaction(type.getText(), tAmount, formattedDate, "");
    	   				//myapp.addTransaction(t1);
    	   				break;
    	   			case 5: 
    	   				//method to view transactions
    	   				break;
    	   			case 6:
    	   				//System.out.println(myapp.calculateBalance());
    	   				break;
    	   			case 7: 
    	   				//method to delete transaction history
    	   				break;
    	   			case 8:
    	   				System.exit(0);
           
           }
           
    	        
       }
       
   }
   
}