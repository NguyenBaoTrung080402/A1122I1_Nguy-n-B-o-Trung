/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.config.DBConnect;
import model.entity.Account;

/**
 *
 * @author TRUNG
 */
public class LoginRero {
    
    public static Account getAccount(String username, String password) {
        
        try (Connection conn = DBConnect.getConnection()) {
            String query = "SELECT * FROM accounttt WHERE username = ? and passwordd = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Account a = new Account();
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("passwordd"));
                return a;
            }
            rs.close();
            ps.close();
            conn.close();
            return null;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Loi lay danh sach hoc sinh!!!");
        }
        return null;
    }
    
    public static void register(Account a){
        
        try (Connection conn = DBConnect.getConnection()) {
            String query = "INSERT INTO accounttt(username, passwordd)\n" + "VALUES(?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, a.getUsername());
            ps.setString(2, a.getPassword());
            
            ps.executeUpdate();
            conn.commit();
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Wrong register!!!");
        }
    }


}
