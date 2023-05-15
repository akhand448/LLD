package com.carRental.akhand;

import java.time.LocalDateTime;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    LocalDateTime bookingDateTime;
    LocalDateTime bookedTillDateTime;
    ReservationStatus reservationstatus;
    Location bookingLocation;

    public Reservation(int reservationId, User user, Vehicle vehicle, LocalDateTime bookedTillDateTime, Location bookingLocation){
        this.reservationId = reservationId;
        this.user = user;
        this.vehicle = vehicle;
        this.bookedTillDateTime = bookedTillDateTime;
        this.bookingLocation = bookingLocation;
        this.bookingDateTime = LocalDateTime.now();
        this.reservationstatus = ReservationStatus.InProgress;
    }

    public void printReservationDetails(){
        System.out.println(" ReservationId: "+this.reservationId);
        System.out.println(" User Name: "+this.user.userName);
        System.out.println(" vehicle No.: "+this.vehicle.vehicleNo);
        System.out.println(" Booking date time: "+this.bookingDateTime);
        System.out.println(" Booked Till: "+ this.bookedTillDateTime);
        System.out.println(" Booking Location: "+this.bookingLocation.storeAddress+","+bookingLocation.pinCode);
    }

    public int getReservationId(){return  this.reservationId;}


}
