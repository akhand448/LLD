package com.ATM.akhand.userDatabase;

public class Account {
    int userId;
    String bankName;
    String IFSC;
    String accountNo;
    double curBAL;

    public Account(int userId,String bankName, String IFSC,String accountNo,double curBAL){
        this.userId=userId;
        this.bankName=bankName;
        this.IFSC=IFSC;
        this.accountNo=accountNo;
        this.curBAL=curBAL;
    }
    public void updateBAL(String action,double amt){
        if(action=="Credit"){
            this.curBAL+=amt;
        }
        else{
            this.curBAL-=amt;
        }
        System.out.print("After successful "+action+" of "+amt+" ,current BAL is: "+this.curBAL);
    }

}
