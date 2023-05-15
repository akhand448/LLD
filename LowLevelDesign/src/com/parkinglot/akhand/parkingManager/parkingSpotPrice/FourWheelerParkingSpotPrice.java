package com.parkinglot.akhand.parkingManager.parkingSpotPrice;

public class FourWheelerParkingSpotPrice implements ParkingSpotPrice {

    String price = "Rs. 50 per hour";
    @Override
    public void price(){
        System.out.println("The parking price for four wheeler is Rs. 50 per hour");
    }
    @Override
    public String getPrice(){
        return price;
    }
}
