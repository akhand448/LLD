package com.Elevator.akhand.Elevators.InternalButtons;

public class InternalButton {
    InternalButtonDispatcher iBDispatcher;

    public InternalButton(InternalButtonDispatcher internalButtonDispatcher){
        this.iBDispatcher=internalButtonDispatcher;
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
        iBDispatcher.dispatchNewRequest(floor,dir);
    }

}
