package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class NormalVehical extends Vehical{

    NormalVehical(){
        super(new NormalDriveStrategy());
    }
}