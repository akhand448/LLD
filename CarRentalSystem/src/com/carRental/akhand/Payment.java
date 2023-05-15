package com.carRental.akhand;

public class Payment {
    Bill bill;
     public Payment(Bill bill){
         this.bill = bill;
     }
     public  void payBill(){
         System.out.println("Bill amount: "+this.bill.getAmount()+" has been paid successfully.");
         bill.isPaid=true;
         bill.reservation.reservationstatus = ReservationStatus.Completed;
     }
}
