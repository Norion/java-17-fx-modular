package com.example.calculator;

public class Calculator {
    public double add(double number1, double number2) {

        return number1+number2;
    }
    public double subtract(double number1, double number2) {

        return number1-number2;
    }
    public double multiply(double number1, double number2) {

        return Math.round(number1*number2*100)/100.00;
    }
    public double divide(double number1, double number2) {

        return Math.round(number1/number2*100)/100.00;
    }
}
