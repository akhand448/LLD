package com.ATM.akhand.userDatabase;

import java.util.ArrayList;

public class userManager {
    ArrayList<Account>accountList = new ArrayList<Account>();
    ArrayList<User>userList = new ArrayList<User>();

    public void addUser(User user){
        userList.add(user);
        System.out.println("User is added successfully.");
    }
    public void addAccount(Account account){
        accountList.add(account);
        System.out.println("Account is added successfully.");
    }
    public User getUser(int userId){
        for(User user:userList){
            if(user.userId==userId){return user;}
        }
        return null;
    }
    public Account getAccount(int userId){
        for(Account account:accountList){
            if(account.userId==userId){return account;}
        }
        return null;
    }
}
