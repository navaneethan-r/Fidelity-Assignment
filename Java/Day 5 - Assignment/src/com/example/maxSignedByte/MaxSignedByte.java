package com.example.maxSignedByte;

import java.util.*;

public class MaxSignedByte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        byte num = sc.nextByte();
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Value of number : " + num);
        System.out.println("Largest value stored in a signed byte : " + maxByte);
    }
}
