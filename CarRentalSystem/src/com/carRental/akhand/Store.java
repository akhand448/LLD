package com.carRental.akhand;

import java.util.ArrayList;

public class Store {
    int storeId;
    public VehicleInventoryManagement vehicleInventoryManagement;
    Location location;
    ArrayList<Reservation> reservationList = new ArrayList<Reservation>();

    public Store(int storeId, VehicleInventoryManagement vehicleInventoryManagement, Location location){
        this.storeId = storeId;
        this.vehicleInventoryManagement = vehicleInventoryManagement;
        this.location = location;
    }

    public Reservation getReservation(int reservationId){
        for(Reservation reservation: reservationList){
            if(reservation.reservationId == reservationId){return reservation;}
        }
        return null;
    }

}
