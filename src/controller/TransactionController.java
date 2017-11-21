/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.TransactionDAO;
import java.util.ArrayList;
import model.Transaction;

/**
 *
 * @author tugced
 */
public class TransactionController {
    private TransactionDAO dao;
    
    public TransactionController(){
        dao = new TransactionDAO();
    }

    public ArrayList<Transaction> getTrFromDB() {
        return dao.getTrFromDB();
    }
    
    public String getType() {
        return dao.getType();
    }
    
}
