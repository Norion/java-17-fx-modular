package com.example.graphics;

public class Rectangular extends Shape{
    private double height;
    private double width;

    public Rectangular(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return height*width;
    }

    @Override
    public double computeCircumference() {
        return 2*height+2*width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public String toString(){
        return "The area is: " + computeArea() + ", the circumference is: " + computeCircumference();
    }
}

