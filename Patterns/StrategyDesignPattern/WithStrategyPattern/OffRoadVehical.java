package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class OffRoadVehical extends Vehical{

    OffRoadVehical(){super(new SportsDriveStrategy());}
}