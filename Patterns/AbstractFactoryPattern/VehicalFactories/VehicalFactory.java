package AbstractFactoryPattern.VehicalFactories;

import AbstractFactoryPattern.Vehicals.Vehical;

public interface VehicalFactory{

    public Vehical getVehical(String input);
}