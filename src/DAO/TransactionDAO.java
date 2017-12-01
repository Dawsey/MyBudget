/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import controller.MysqlConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Income;
import model.Expense;
import model.Transaction;

/**
 *
 * @author tugced
 */
public class TransactionDAO {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TransactionDAO(){
        conn = MysqlConnect.connectDB(); // connect to my db
    }
    
    public String getType() {
        try {
            String sql = "select Type from transaction";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            String type="";
            if(rs.getString("Type").equals("Income")) {
                type = "Income";
                return type;
            }
            if(rs.getString("Type").equals("Expense")) {
                type = "Expense";
                return type;
            }
                
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<Transaction> getTrFromDB() {

        try {
            String sql = "select * from transaction";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ArrayList<Transaction> incomeList = new ArrayList<>();
            ArrayList<Transaction> expenseList = new ArrayList<>();
            
            while(rs.next()) {
                if(rs.getString("Type").equals("Income")) {
                    Transaction tr = new Income(rs.getString("date"), rs.getString("amount"), rs.getString("currency"), rs.getString("category"));
                    incomeList.add(tr);
                    return incomeList;
                }
                if(rs.getString("Type").equals("Expense")) {
                    Transaction tr = new Expense(rs.getString("date"), rs.getString("amount"), rs.getString("currency"), rs.getString("category"));
                    expenseList.add(tr);
                    return expenseList;
                }
                
            }
           
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
        return null;
    }


}
