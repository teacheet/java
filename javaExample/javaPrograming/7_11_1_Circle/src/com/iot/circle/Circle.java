package com.iot.circle;

public class Circle {
    private  static  int nextID = 0;

    public  static int getNextID(){ return nextID;}


    private int id;

    public int getID(){
        return id;
    }

    private double radius;

    public Circle( double radius ){
        this.radius = radius;
        id = nextID;
        ++nextID;
    }
}
class StaticTest
{
    public static void main( String args[] ){
        System.out.println( Circle.getNextID());
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        System.out.println( circle1.getID());
        System.out.println( circle2.getID());
        System.out.println( Circle.getNextID());
    }
}
