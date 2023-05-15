package com.parkinglot.akhand.exitGate.costCalculation;
import com.parkinglot.akhand.ticket.Ticket;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CostCalculator {

    Ticket ticket;
    String vehicleType;

    int cost;

    LocalDateTime outTime;
    public CostCalculator(Ticket ticket){
        this.ticket=ticket;
        this.vehicleType = ticket.getVehicle().getVehicleType();
        if(vehicleType=="TwoWheeler"){this.cost = 20*8;}
        else{this.cost=50*5;}
        this.outTime = LocalDateTime.now();
    }

    public int getCost(){return this.cost;}
    public LocalDateTime getOutTime(){return this.outTime;}
}
