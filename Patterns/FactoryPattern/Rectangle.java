package FactoryPattern;

import FactoryPattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void drwa(){
        System.out.println("rectangle");
    }
}