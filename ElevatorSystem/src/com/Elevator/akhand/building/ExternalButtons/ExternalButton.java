package com.Elevator.akhand.building.ExternalButtons;
import com.Elevator.akhand.Direction;

import java.util.Scanner;

public class ExternalButton {
    ExternalButtonDispatcher exBtnDispatcher;
    public ExternalButton(ExternalButtonDispatcher exBtnDispatcher){
        this.exBtnDispatcher = exBtnDispatcher;
    }

//    public void pressButton(){
//        int floor;
//        String dir;
//        Scanner ss = new Scanner(System.in);
//        System.out.println("Enter Floor:");
//        floor = ss.nextInt();
//        Scanner sss = new Scanner(System.in);
//        System.out.println("Enter Direction (UP/DOWN):");
//        dir = sss.nextLine();
//        exBtnDispatcher.submitNewRequest(floor,dir);
//    }
    public void pressButton(int floor,String dir){
        exBtnDispatcher.submitNewRequest(floor,dir);
    }
}
