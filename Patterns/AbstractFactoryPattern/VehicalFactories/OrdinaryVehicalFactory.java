package AbstractFactoryPattern.VehicalFactories;

import AbstractFactoryPattern.VehicalFactories.VehicalFactory;

public class OrdinaryVehicalFactory implements VehicalFactory{

    @Override
    public Vehical getVehical(String input){

        switch(input)
            case "ORDINARY V1":
                return new OrdinaryV1();
            case "ORDINARY V2":
                return new OrdinaryV2();
            default:
                return null;
    }
}