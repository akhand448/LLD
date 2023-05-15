package AbstractFactoryPattern.VehicalFactories;

import AbstractFactoryPattern.VehicalFactories.AbstractVehicalFactory;

public class MainClass{

    public static void main(String arg[]){

        AbstractVehicalFactory abstractFactory = new AbstractVehicalFactory();
        VehicalFactory vehicalFactoryObj = abstractFactory.getVehicalFactory("LUXARY VEHICALS");
        Vehical luxary1Obj = vehicalFactoryObj.getVehical("LUXARY V1");
        Vehical ordinary1Obj = vehicalFactoryObj.getVehical("ORDINARY V1");
    }
}