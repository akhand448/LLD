package AbstractFactoryPattern.Vehicals;

import AbstractFactoryPattern.vehicals.Vehical;

public class OrdinaryV1 implements Vehical{

    @Override
    public void vehicalName(){
        System.out.println("Bolero");
    }
}