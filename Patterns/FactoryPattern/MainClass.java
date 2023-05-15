package FactoryPattern;

import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;

public class Mainclass{

    public static void main(String arg[]){

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape newObj = shapeFactory.getShape(input: "CIRCLE");
        newObj.draw();
    }
}