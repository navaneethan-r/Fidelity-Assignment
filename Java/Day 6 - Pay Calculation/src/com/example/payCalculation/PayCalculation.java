package com.example.payCalculation;

import java.util.Scanner;

public class PayCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hours worked : ");
        int hours = sc.nextInt();
        System.out.println("The calculated net pay is $" + Pay.calculateNetPay(hours));
    }
}
