package com.parkinglot.akhand.parkingManager.parkingSpot;
import com.parkinglot.akhand.parkingManager.parkingSpotPrice.ParkingSpotPriceFactory;
import com.parkinglot.akhand.parkingManager.parkingSpotPrice.ParkingSpotPrice;
import com.parkinglot.akhand.vehicle.Vehicle;

public class ParkingSpot {

    int id;
    boolean isEmpty;
    Vehicle vehicle;

    public ParkingSpot(int id){
        this.id=id;
        isEmpty=true;

    }
    public void setId(int id){
        this.id=id;
    }
    public void assignSpot(Vehicle vehicle){
        this.vehicle=vehicle;
        this.isEmpty=false;
    }
    public void releaseSpot(){
        this.vehicle = null;
        this.isEmpty=true;
    }
    public Vehicle getVehicle(){return this.vehicle;}
    public int getId(){
        return id;
    }
    public boolean getStatus(){return this.isEmpty;}
    public void getPrice(){
        ParkingSpotPriceFactory parkingSpotPriceFactory = new ParkingSpotPriceFactory(vehicle.getVehicleType());
        ParkingSpotPrice parkingSpotPrice = parkingSpotPriceFactory.getParkingSpotPrice();
        parkingSpotPrice.price();

    }
}
