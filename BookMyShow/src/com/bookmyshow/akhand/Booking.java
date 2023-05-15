package com.bookmyshow.akhand;

import java.util.ArrayList;

public class Booking {
    
    Show show;
    ArrayList<Seat> bookedSeats = new ArrayList<>();
    Payment payment;

    public Booking(Show show, ArrayList<Seat> bookedSeats, Payment payment){
        this.show=show;
        this.bookedSeats=bookedSeats;
        this.payment=payment;
    }

    public Show getShow(){
        return this.show;
    }

    public ArrayList<Seat> getBookedSeats(){
        return this.bookedSeats;
    }

    public Payment getPayment(){
        return this.payment;
    }
}
