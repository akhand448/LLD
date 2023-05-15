package com.parkinglot.akhand.vehicle;

public class Vehicle {
    int id;
    private String vehicleType;

    public Vehicle(int id,String vehicleType){
        this.id = id;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType(){
        return vehicleType;
    }
    public int getVehicleId(){return this.id;}
}
