package com.Elevator.akhand.building.ExternalButtons;

import com.Elevator.akhand.Elevators.ElevatorController;
import com.Elevator.akhand.Direction;

import java.util.ArrayList;

public class ExternalButtonDispatcher {
    public ArrayList<ElevatorController> controllersList = new ArrayList<ElevatorController>();
    public ExternalButtonDispatcher(ElevatorController elevatorController){
        controllersList.add(elevatorController);
    }
    public void submitNewRequest(int floor, String direction){
        controllersList.get(0).acceptNewRequest(floor,direction);

    }
}
