package com.parkinglot.akhand;

import com.parkinglot.akhand.entranceGate.EntranceGate;
import com.parkinglot.akhand.exitGate.unParkVehicle.Unpark;
import com.parkinglot.akhand.parkingManager.ParkingManager;
import com.parkinglot.akhand.parkingManager.VehicleManagerFactory;
import com.parkinglot.akhand.parkingManager.parkingSpot.ParkingSpot;
import com.parkinglot.akhand.vehicle.Vehicle;
import com.parkinglot.akhand.ticket.Ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle>vehicles = new ArrayList<Vehicle>();
        ArrayList<ParkingSpot> list = new ArrayList<ParkingSpot>();
        for(int i=0; i<15; i++){
            ParkingSpot parkingSpot = new ParkingSpot(i+1);
            list.add(parkingSpot);
        }
        vehicles.add(new Vehicle(0,"TwoWheeler"));
        VehicleManagerFactory vmf = new VehicleManagerFactory(list,vehicles.get(0).getVehicleType());
        ParkingManager parkingManager = vmf.createManager();
        EntranceGate entranceGate = new EntranceGate(parkingManager);

        int status = 1;
        do{
            char input;
            System.out.println("Want to park vehicle ? Enter 'P': ");
            System.out.println("Want to un-park vehicle ? Enter 'U': ");
            Scanner s = new Scanner(System.in);
            input = s.next().charAt(0);
            switch(input){
                case 'P':{
                    int vId;
                    System.out.println("Enter vehicle id: ");
                    vId = s.nextInt();
                    System.out.println("Enter vehicle Type: ");
                    Scanner ss = new Scanner(System.in);
                    String vType = ss.nextLine();
                    Vehicle vehicle = new Vehicle(vId, vType);
                    entranceGate.parkVehicle(vehicle);
                    vehicles.add(vehicle);
                }
                break;
                case 'U':{
                    int tId;
                    System.out.println("Enter Ticket Id: ");
                    tId = s.nextInt();
                    Ticket ticket = parkingManager.getTicket(tId);
                    Unpark unpark = new Unpark(ticket);
                    vehicles.remove(ticket.getVehicle());
                }
                break;
            }

            System.out.println("Want to Continue/exit? Enter 1/0: ");
            status = s.nextInt();

        }while(status==1);


    }
}