package com.parkinglot.akhand.exitGate.unParkVehicle;
import com.parkinglot.akhand.exitGate.costCalculation.CostCalculator;
import com.parkinglot.akhand.parkingManager.ParkingManager;
import com.parkinglot.akhand.ticket.Ticket;
import com.parkinglot.akhand.vehicle.Vehicle;

public class Unpark {

    Ticket ticket;

    public Unpark(Ticket ticket){
        this.ticket=ticket;
        printSlip();

    }
    public void printSlip(){
        Vehicle vehicle = ticket.getVehicle();
        System.out.println("Vehicle ID: "+vehicle.getVehicleId());
        System.out.println("Vehicle Type: "+vehicle.getVehicleType());
        System.out.println("Parking Time: "+ticket.getTime());
        CostCalculator costCalculator = new CostCalculator(ticket);
        System.out.println("The Total parking cost is: "+costCalculator.getCost());
        System.out.println("Out time: "+ costCalculator.getOutTime());
        System.out.println("Total Payment: "+costCalculator.getCost());
        ParkingManager.removeVehicle(ticket.getVehicle());
    }
}
