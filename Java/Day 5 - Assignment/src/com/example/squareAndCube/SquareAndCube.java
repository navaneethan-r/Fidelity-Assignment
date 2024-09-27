package com.example.squareAndCube;

import java.util.*;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        double num = sc.nextInt();
        sc.close();
        System.out.println();

        Calc calc = new Calc(num);
        calc.findSquare();
        calc.findCube();
    }
}
