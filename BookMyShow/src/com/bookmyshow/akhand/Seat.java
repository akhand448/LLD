package com.bookmyshow.akhand;

public class Seat {
    int seatId;
    int seatRow;
    Category seatCategory;
    int seatPrice;
    public Seat(int seatId,int seatRow,Category seatCategory,int price){
        this.seatId=seatId;
        this.seatRow=seatRow;
        this.seatCategory=seatCategory;
        this.seatPrice=price;
    }

    public int getSeatId(){
        return this.seatId;
    }

    public int getSeatRow(){
        return this.seatRow;
    }

    public Category getSeatCategory(){
        return this.seatCategory;
    }

    public int getSeatPrice(){
        return this.seatPrice;
    }
}
