package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class SportsVehical extends Vehical{

    SportsVehical(){super(new SportsStrategy());}
}