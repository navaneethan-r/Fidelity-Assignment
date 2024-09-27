package com.example.calculator;

public class Calc {

    public void add(int num1,int num2){
        int res = num1 + num2;
        System.out.println("Result of "+ num1 + " + " + num2 + " is " + res);
        System.out.println();
    }

    public void sub(int num1,int num2){
        int res = num1 - num2;
        System.out.println("Result of "+ num1 + " - " + num2 + " is " + res);
        System.out.println();
    }

    public void mul(int num1,int num2){
        int res = num1 * num2;
        System.out.println("Result of "+ num1 + " * " + num2 + " is " + res);
        System.out.println();
    }

    public void div(int num1,int num2){
        double res = (double) num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Result of "+ num1 + " / " + num2 + " is " + res);
        System.out.println("Remainder = " + remainder);
        System.out.println();
    }
}
