package com.Elevator.akhand.Elevators;

import com.Elevator.akhand.Direction;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ElevatorController {
    ElevatorCar elevatorCar;
    PriorityQueue<Integer> upJobs = new PriorityQueue<Integer>();
    PriorityQueue<Integer> downJobs = new PriorityQueue<Integer>(Comparator.reverseOrder());
    Queue<Integer> upPendingJobs = new LinkedList<Integer>();
    Queue<Integer> downPendingJobs = new LinkedList<Integer>();

    public ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
    }


    public void acceptNewRequest(int reqFloor, String reqDirection){
        if((elevatorCar.direction=="UP") && (elevatorCar.currentFloor<=reqFloor)){
            upJobs.add(reqFloor);
        }
        else if((elevatorCar.direction=="Down") && (elevatorCar.currentFloor>=reqFloor)){
            downJobs.add(reqFloor);
        }
        else{
            if(reqDirection=="UP"){upPendingJobs.add(reqFloor);}
            else{downPendingJobs.add(reqFloor);}
        }
        System.out.println("Got new request for floor: "+reqFloor+" and Direction: "+reqDirection);
    }

    void runTimeRequest() throws InterruptedException {
        System.out.println("Want new request ?(Y/N)");
        String choice="N";
        Scanner s = new Scanner(System.in);
        choice = s.next();
        if(choice.equals("Y")){

            int n;
            System.out.println("how many request do you want ?");
            Scanner ip = new Scanner(System.in);
            n=ip.nextInt();
            while(n>0) {
                int floor;
                String dir;
                Scanner ss = new Scanner(System.in);
                System.out.println("Enter Floor:");
                floor = ss.nextInt();
                Scanner sss = new Scanner(System.in);
                System.out.println("Enter Direction (UP/DOWN):");
                dir = sss.nextLine();
                acceptNewRequest(floor, dir);
                n -= 1;
            }
        }
    }

    public void controlManager() throws InterruptedException {

        while(upJobs.size()>0 || downJobs.size()>0 || upPendingJobs.size()>0 || downPendingJobs.size()>0){

            if(elevatorCar.direction=="UP"){
                while(!upJobs.isEmpty()){

                    int curJob = upJobs.remove();
                    System.out.println("Completing job at floor No.: "+curJob);
                    runTimeRequest();
                }
                while(!downPendingJobs.isEmpty()){
                    int temp = downPendingJobs.remove();
                    downJobs.add(temp);
                }
                elevatorCar.direction="Down";
            }
            if(elevatorCar.direction=="Down"){
                while(!downJobs.isEmpty()){

                    int curJob = downJobs.remove();
                    System.out.println("Completing job at floor No.: "+curJob);
                    runTimeRequest();
                }
                while(!upPendingJobs.isEmpty()){
                    int temp = upPendingJobs.remove();
                    upJobs.add(temp);
                }
                elevatorCar.direction="UP";
            }
        }
    }

}
