package com.company;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double r, double h){
        height = h;
        base = new Circle(r);

    }

    public double vol(){
        return base.getArea() * height;
    }

    public double sa(){
        return ((2 * base.getArea()) * height) + (base.getCircumference() * height);
    }

}
