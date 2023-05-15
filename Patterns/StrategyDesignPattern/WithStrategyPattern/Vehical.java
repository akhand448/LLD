package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public void class Vehical{

    DriveStrategy driveObject;

    Vehical(DriveStrategy newObj){
        this.driveObject = newObj;
    }

    public void drive(){
        driveObject.drive();
    }
}