package com.parkinglot.akhand.entranceGate;

import com.parkinglot.akhand.parkingManager.ParkingManager;
import com.parkinglot.akhand.ticket.Ticket;
import com.parkinglot.akhand.vehicle.Vehicle;

public class EntranceGate {
    ParkingManager parkingManager;
    Vehicle vehicle;
    int cur=0;

    public EntranceGate(ParkingManager parkingManager){
        this.parkingManager = parkingManager;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        parkingManager.findParkingSpot();
        if(parkingManager.isAvailable()){
            Ticket ticket = new Ticket(vehicle,parkingManager.getSpot(),000+cur);
            ticket.getTicketDetails();
            cur++;
            parkingManager.parkVehicle(vehicle);
        }

    }
}
