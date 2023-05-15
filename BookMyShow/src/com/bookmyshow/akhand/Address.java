package com.bookmyshow.akhand;

public class Address {
    String address;
    City city;
    public Address(String address, City city){
        this.address=address;
        this.city=city;
    }

    public String getAddress(){
        return this.address;
    }

    public City getCity(){
        return this.city;
    }
}
