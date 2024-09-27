package com.example.registrationForm;

import java.util.*;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your country : ");
        String countryName = sc.nextLine();
        System.out.println();
        sc.close();

        Register register = new Register(name, age, countryName);
        register.displayInfo();
    }
}
