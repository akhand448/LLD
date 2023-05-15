package AbstractFactoryPattern.VehicalFactories;

import AbstractFactoryPattern.VehicalFactories.VehicalFactory;

public class LuxaryVehicalFactory implements VehicalFactory{

    @Override
    public Vehical getVehical(String input){

        switch(input)
            case "LUXARY V1":
                return new LuxaryV1();
            case "LUXARY V2":
                return new LuxaryV2();
            default:
                return null;
    }
}