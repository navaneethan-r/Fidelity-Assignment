package com.example.squareAndCube;

public class Calc {
    private final double num;

    public Calc(double num) {
        this.num = num;
    }

    public void findSquare(){
        double square = Math.pow(num, 2);
        System.out.println("Square of " + num + " is " + square);
    }

    public void findCube(){
        double cube = Math.pow(num, 3);
        System.out.println("Cube of " + num + " is " + cube);
    }
}
