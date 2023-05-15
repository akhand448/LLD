package com.parkinglot.akhand.parkingManager;
import java.util.ArrayList;
import java.util.Iterator;

import com.parkinglot.akhand.exitGate.costCalculation.CostCalculator;
import com.parkinglot.akhand.parkingManager.parkingSpot.ParkingSpot;
import com.parkinglot.akhand.vehicle.Vehicle;
import com.parkinglot.akhand.ticket.Ticket;

public class ParkingManager {
   static ArrayList<ParkingSpot>spots;
    ArrayList<Ticket>tickets = new ArrayList<Ticket>();
    int cur = 1;

    public ParkingManager(ArrayList<ParkingSpot> spots){
        this.spots = spots;
        setSpotId();

    }

     void setSpotId(){
        for(int i=1;i<spots.size();i++){
            spots.get(i).setId(i+1);
        }
    }

    public boolean isAvailable(){
       for(int i=1;i<spots.size();i++){
           if(spots.get(i).getStatus()){cur= i;return true;}
       }
       return false;
    }

    public void findParkingSpot(){
        if(isAvailable()){System.out.println("Space is available");}
        else{System.out.println("NO space is available");}
    }
    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }
    public void removeTickets(Ticket ticket){
        Iterator itr = tickets.iterator();
//        while(itr.hasNext()){
//            Object tick = itr.next();
//            if(tick.)
//        }
    }
    public void parkVehicle(Vehicle vehicle){
        if(isAvailable()){
            spots.get(cur).assignSpot(vehicle);
            Ticket curTicket = new Ticket(vehicle,spots.get(cur),000+cur);
            addTicket(curTicket);
            System.out.println("Vehicle is parked successfully");
        }
        else{
            System.out.println("Sorry! No spot available");
        }
    }
    public static void removeVehicle(Vehicle vehicle){
        for(int i=1;i<spots.size();i++){
            Vehicle vehicle1 = spots.get(i).getVehicle();
            if(vehicle1.getVehicleId()==vehicle.getVehicleId()){
                spots.get(i).releaseSpot();
                System.out.println("\n Vehicle is removed successfully!");
                break;
            }
        }


    }
    public ParkingSpot getSpot(){
        return spots.get(cur);
    }
    public Ticket getTicket(int i){return tickets.get(i);}
}
