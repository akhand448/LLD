package com.parkinglot.akhand.parkingManager;

import com.parkinglot.akhand.parkingManager.parkingSpot.ParkingSpot;

import java.util.ArrayList;

public class FourWheelerManager extends ParkingManager{

    public FourWheelerManager(ArrayList<ParkingSpot> list2){
        super(list2);
        System.out.println("Four Wheeler");
    }
}
