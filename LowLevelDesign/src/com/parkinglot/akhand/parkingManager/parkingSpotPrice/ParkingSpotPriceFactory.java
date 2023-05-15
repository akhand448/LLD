package com.parkinglot.akhand.parkingManager.parkingSpotPrice;

public class ParkingSpotPriceFactory {
    String input;
    public ParkingSpotPriceFactory(String input){
        this.input=input;
    }

    public ParkingSpotPrice getParkingSpotPrice(){
        switch (input){
            case "TwoWheeler":
                return new TwoWheelerParkingSpotPrice();
            case "FourWheeler":
                return new FourWheelerParkingSpotPrice();
        }
        return new TwoWheelerParkingSpotPrice();
    }

}
