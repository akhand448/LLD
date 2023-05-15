import com.Elevator.akhand.Elevators.ElevatorCar;
import com.Elevator.akhand.Elevators.ElevatorController;
import com.Elevator.akhand.building.ExternalButtons.ExternalButton;
import com.Elevator.akhand.building.ExternalButtons.ExternalButtonDispatcher;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ElevatorCar elevatorCar = new ElevatorCar(1,0,"UP");
        ElevatorController elevatorController = new ElevatorController(elevatorCar);
        ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher(elevatorController);
        ExternalButton externalButton = new ExternalButton(externalButtonDispatcher);
        for(int i=0;i<2;i++){

            int floor = ThreadLocalRandom.current().nextInt(1,8);
            String dir;
            if(floor%2==0){dir = "UP";}
            else{dir = "DOWN";}
            externalButton.pressButton(floor,dir);
        }

        elevatorController.controlManager();
    }
}