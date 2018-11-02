package com.kodilla.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.println("4+5= "+ calculator.add(4,5));
        System.out.println("9-3= "+ calculator.subtract(9,3));
    }

}
