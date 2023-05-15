package com.carRental.akhand;

public class Location {
    public String storeAddress;
    public String storeCity;
    public String storeState;
    public int pinCode;

    public Location(String storeAddress, String storeCity, String storeState, int pinCode){
        this.storeAddress = storeAddress;
        this.storeCity = storeCity;
        this.storeState = storeState;
        this.pinCode = pinCode;
    }
}
