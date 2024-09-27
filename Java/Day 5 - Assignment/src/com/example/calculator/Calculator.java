package com.example.calculator;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value 2 : ");
        int num2 = sc.nextInt();

        Calc calc = new Calc();

        while(true){
            System.out.println("Choose the calculation Operator");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Exit");


            System.out.print("Enter the your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 :
                    calc.add(num1,num2);
                    break;
                case 2 :
                    calc.sub(num1,num2);
                    break;
                case 3 :
                    calc.mul(num1,num2);
                    break;
                case 4 :
                    calc.div(num1,num2);
                    break;
                case 5 :
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println();
                    System.out.println("Choice the valid choice");
                    System.out.println();
            }
        }

    }
}
