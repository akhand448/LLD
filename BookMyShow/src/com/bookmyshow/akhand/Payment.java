package com.bookmyshow.akhand;

import java.util.concurrent.ThreadLocalRandom;

public class Payment {
    
    int paymentId;
    int price;
    public Payment(int price){
        this.price = price;
        this.paymentId=ThreadLocalRandom.current().nextInt(600,1200);
    }
    public int getPaymentId(){return this.paymentId;}
    public int getPaymentAmount(){return this.price;}
}
