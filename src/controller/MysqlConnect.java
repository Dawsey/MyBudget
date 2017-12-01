/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author tugced
 */
public class MysqlConnect {
    Connection conn = null;
    
    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // loading the driver
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/budgetdb","root","root");
            //JOptionPane.showMessageDialog(null, "Connection Successful");
            
            return conn;
           
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;    
        }
    }
}
