package com.Elevator.akhand.Elevators.InternalButtons;

import com.Elevator.akhand.Elevators.ElevatorController;

import java.util.ArrayList;

public class InternalButtonDispatcher {
    ArrayList<ElevatorController>controllersList = new ArrayList<ElevatorController>();
    public InternalButtonDispatcher(ElevatorController elevatorController){
        this.controllersList.add(elevatorController);
    }
    public void dispatchNewRequest(int floor, String direction){
        controllersList.get(0).acceptNewRequest(floor,direction);
    }

}
