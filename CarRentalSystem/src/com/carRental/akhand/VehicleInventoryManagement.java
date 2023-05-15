package com.carRental.akhand;

import java.util.ArrayList;

public class VehicleInventoryManagement {
   public  ArrayList<Vehicle>vehicleList = new ArrayList<Vehicle>();

    public void addVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
        System.out.println("Vehicle with vehicle No: "+vehicle.vehicleNo+" has been successfully added to Inventory");
    }
    public void removeVehicle(int vehicleId){
        for(Vehicle v: vehicleList){
            if(v.vehicleId==vehicleId){
                vehicleList.remove(v);
                System.out.println("vehicle is removed successfully.");
                break;
            }
        }
    }

    public Vehicle searchVehicle(){
        for(Vehicle vehicle:vehicleList){
            if(vehicle.status == ReservationStatus.UNRESERVED){
                return vehicle;
            }
        }
        return null;
    }

}
