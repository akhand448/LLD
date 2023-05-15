package WithStrategyPattern.Stratey;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive(){
        //some code
        System.out.println("Sports drive capabilities");
    }
}