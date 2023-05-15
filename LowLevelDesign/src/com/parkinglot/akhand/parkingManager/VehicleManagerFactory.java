package com.parkinglot.akhand.parkingManager;

import com.parkinglot.akhand.parkingManager.parkingSpot.ParkingSpot;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VehicleManagerFactory {
    String vehicleType;
    ArrayList<ParkingSpot> list;
    public VehicleManagerFactory(ArrayList<ParkingSpot> list, String vehicleType){
        this.vehicleType = vehicleType;
        this.list = list;
    }

    public ParkingManager createManager(){
        switch(vehicleType){
            case "TwoWheeler": return new TwoWheelerManager(list);
            case "FourWheeler": return new FourWheelerManager(list);
        }
        return new FourWheelerManager(list);
    }

}
