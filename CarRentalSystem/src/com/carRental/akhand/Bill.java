package com.carRental.akhand;

public class Bill {
    Reservation reservation;
    Boolean isPaid;
    Double amount;

    public Bill(Reservation reservation){
        this.reservation = reservation;
        isPaid = false;
        calculateBill();
    }
    void calculateBill(){
        this.amount=2034.50;
    }
    public  double getAmount(){return amount;}
    public boolean getPaymentStatus(){return isPaid;}
}
