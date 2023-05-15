package com.Elevator.akhand.Elevators;
import com.Elevator.akhand.Direction;
import com.Elevator.akhand.Elevators.InternalButtons.InternalButton;
import com.Elevator.akhand.Status;
import com.Elevator.akhand.building.ExternalButtons.ExternalButton;

public class ElevatorCar {
    int id;
   // Display display;
    int currentFloor;
    String direction;
   // Status status;
    //InternalButton iBtn;

    public ElevatorCar(int id,int currentFloor, String direction){
        this.id=id;
        this.currentFloor=currentFloor;
        this.direction=direction;
    }

    //ExternalButton externalButton;
    //Door door;

}
