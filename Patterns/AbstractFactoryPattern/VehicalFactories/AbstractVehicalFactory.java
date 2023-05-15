package AbstractFactoryPattern.VehicalFactories;

import AbstractFactoryPattern.VehicalFactories.VehicalFactory;

public class AbstractVehicalFactory{

    Public VehicalFactory getVehicalCategory(String input){

        switch(input)
            case "LUXARY VEHICALS":
                return new LuxaryVehicalFactory();
            case "ORDINARY VEHICALS":
                return new OrdinaryVehicalFactory();
            default:
                null;
    }
}