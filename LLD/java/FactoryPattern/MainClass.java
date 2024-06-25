package FactoryPattern;

public class MainClass {

    public static void main(String args[]) {
        ShapeFactory shapeFactoryObject = new ShapeFactory();
        Shape shapeObject = shapeFactoryObject.getShape("CIRCLE");
        shapeObject.draw();
    }
}