/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.entity.Account;
import model.repository.LoginRero;

/**
 *
 * @author TRUNG
 */
public class AccountService {
    
    public static Account getAccount(String username, String password){
        return LoginRero.getAccount(username, password);
    }
    public static void register(Account a){
        LoginRero.register(a);
    }
}
