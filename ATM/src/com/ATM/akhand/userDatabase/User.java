package com.ATM.akhand.userDatabase;

public class User {
    int userId;
    String userName;
    String cardNo;
    int userPin;

    public User(int userId, String userName, String cardNo,int userPin){
        this.userId=userId;
        this.userName=userName;
        this.cardNo=cardNo;
        this.userPin=userPin;
    }
    public void updatePin(int newPin){
        this.userPin=newPin;
        System.out.println("The PIN is successfully updated.");
    }
    public boolean isValidPin(int pin){
        return (this.userPin==pin)?true:false;
    }

}
