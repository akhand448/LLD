package com.parkinglot.akhand.parkingManager;

import com.parkinglot.akhand.parkingManager.parkingSpot.ParkingSpot;

import java.util.ArrayList;

public class TwoWheelerManager extends ParkingManager{


     public TwoWheelerManager(ArrayList<ParkingSpot> list1){
        super(list1);
        System.out.println("Two Wheeler");
    }
}
