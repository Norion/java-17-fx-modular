package com.example.graphics;

public abstract class Shape {

    private double x;
    private double y;

    public  Shape(double x, double y){
        this.x = x;
        this.y = y;
    }


    public abstract double computeArea();

    public abstract double computeCircumference();

    public abstract String toString();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
