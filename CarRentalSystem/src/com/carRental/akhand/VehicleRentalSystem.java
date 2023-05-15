package com.carRental.akhand;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class VehicleRentalSystem {
    public ArrayList<Store>storeList = new ArrayList<Store>();
    public ArrayList<User>userList = new ArrayList<User>();

    int temRId=1;

    public void addStore(Store store){
        storeList.add(store);
        System.out.println("Store is added successfully.");
    }
    public void addUser(User user){
        userList.add(user);
        System.out.println("User is added successfully.");
    }

    public Store storeInquiryByPinCode(int pinCode){
        for(Store store: storeList){
            if(store.location.pinCode == pinCode){
                System.out.println("\n Store is available at given location.");
                return store;
            }
        }
        System.out.println("\n Sorry! No store is available at the given location.");
        return null;
    }
    public Vehicle vehicleInquiry(Store store){
        Vehicle vehicle = store.vehicleInventoryManagement.searchVehicle();
        if(vehicle!=null){
            System.out.println(" vehicle is available\n");
        }
        else{
            System.out.println("\n Sorry! no vehicle is available at the moment. \n");
        }
        return vehicle;
    }

    public int makeReservation(User user, Vehicle vehicle, LocalDateTime bookedTill,Store store){
        int reservationId = temRId+1000;
        Reservation reservation = new Reservation(reservationId,user,vehicle,bookedTill,store.location);
        store.reservationList.add(reservation);
        vehicle.status = ReservationStatus.InProgress;
        temRId++;
        reservation.printReservationDetails();
        return reservationId;
    }

    public void checkOutReservation(int reservationId){
        Reservation reservation =null;
        Vehicle vehicle = null;
        for(Store store: storeList){
            reservation=store.getReservation(reservationId);
            if(reservation!=null){
                vehicle = store.vehicleInventoryManagement.searchVehicle();
                break;
            }
        }
        Bill bill = new Bill(reservation);
        Payment payment = new Payment(bill);
        vehicle.status = ReservationStatus.UNRESERVED;
        payment.payBill();
        System.out.println("You are successfully checked out.");
    }
}
