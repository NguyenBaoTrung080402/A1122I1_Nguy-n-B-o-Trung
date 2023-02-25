
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public interface DBConnect {
    public static String serverName = "LAPTOP-J3M28VMJ";
    public static String dbName = "logindemo";
    public static String portNumber = "1433";
    public static String userID = "sa";
    public static String password = "123"; 
    
    public static Connection getConnection(){
        try {
            String url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, userID, password);
        } catch (Exception e) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }   
    
//    Test connection
    public static void main(String[] args) {
        try{
            if(DBConnect.getConnection()!=null) System.out.println("Connect successfully!");
            else System.out.println("Connect failed!");
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Error at model.DBContext.DBContext().getConnertion()");
        }        
    }
}