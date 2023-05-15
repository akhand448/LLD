package FactoryPattern;

import FactoryPattern.Shape;

public class Shapefactory{

    Shape getShape(String input){

        switch(input){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}