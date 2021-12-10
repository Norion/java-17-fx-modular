package com.example.graphics;

public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double computeCircumference() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "The area is: " + computeArea() + ", the circumference is: " + computeCircumference();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
