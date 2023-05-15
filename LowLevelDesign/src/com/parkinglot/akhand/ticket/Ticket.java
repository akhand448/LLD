package com.parkinglot.akhand.ticket;
import com.parkinglot.akhand.parkingManager.parkingSpot.ParkingSpot;
import com.parkinglot.akhand.parkingManager.parkingSpotPrice.ParkingSpotPrice;
import com.parkinglot.akhand.parkingManager.parkingSpotPrice.ParkingSpotPriceFactory;
import com.parkinglot.akhand.vehicle.Vehicle;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Ticket {

    long tId;
    LocalDateTime time;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    String price;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot,long tId){
        this.tId = tId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.time = LocalDateTime.now();
        ParkingSpotPriceFactory PSPFact= new ParkingSpotPriceFactory(vehicle.getVehicleType());
        ParkingSpotPrice parkingSpotPrice = PSPFact.getParkingSpotPrice();
        this.price = parkingSpotPrice.getPrice();
    }
    public void getTicketDetails(){
        System.out.println("TicketId: "+tId);
        System.out.println("Parking Time: "+time);
        System.out.println("Vehicle Type: "+vehicle.getVehicleType());
        System.out.println("Parking Spot No.: "+parkingSpot.getId());
        System.out.println("Pricing plan: "+price);

    }
    public LocalDateTime getTime(){return time;}
    public Vehicle getVehicle(){return vehicle;}



}
