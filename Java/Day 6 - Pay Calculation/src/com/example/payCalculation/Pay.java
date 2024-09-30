package com.example.payCalculation;

public class Pay {

    private static final int standardHour = 56;
    private static final int standardRate = 80;
    private static final double OverTimeRate = 1.5;
    private static final double standardTax = 0.02;

    public static double calculateGrossPay(int hours){
        double grossPay;
        if(hours <= standardHour){
            grossPay = hours * standardRate;
        }
        else{
            int extraHours = hours - standardHour;
            grossPay = (standardHour * standardRate) + (extraHours * standardRate * OverTimeRate);
        }
        return grossPay;
    }

    public static double calculateTax(double grossPay){
        double tax;
        tax = grossPay * standardTax;
        return  tax;
    }

    public static double calculateNetPay(int hours) {
        double grossPay = calculateGrossPay(hours);
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }
}
