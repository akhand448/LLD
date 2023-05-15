package com.carRental.akhand;

import jdk.jshell.Snippet;

import java.time.LocalDate;

public class Vehicle {
    int vehicleId;
    int vehicleNo;
    String vehicleType;
    int kmDriven;
    LocalDate dateOfManufacturing;
    ReservationStatus status;

    public Vehicle(int vehicleId, int vehicleNo, String vehicleType, int kmDriven, LocalDate dateOfManufacturing){
        this.vehicleId = vehicleId;
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.kmDriven = kmDriven;
        this.dateOfManufacturing = dateOfManufacturing;
        this.status = ReservationStatus.UNRESERVED;
    }
}
