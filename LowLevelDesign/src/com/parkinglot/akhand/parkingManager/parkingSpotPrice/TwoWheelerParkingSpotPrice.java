package com.parkinglot.akhand.parkingManager.parkingSpotPrice;

import com.parkinglot.akhand.parkingManager.parkingSpotPrice.ParkingSpotPrice;

public class TwoWheelerParkingSpotPrice implements ParkingSpotPrice {

    String price = "Rs. 20 per hour";
    @Override
    public void price(){
        System.out.println("The price for Two Wheeler spot is: Rs. 20 per hour");
    }

    @Override
    public String getPrice(){
        return price;
    }
}
