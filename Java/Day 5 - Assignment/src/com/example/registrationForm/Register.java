package com.example.registrationForm;

public class Register {

    private final String name;
    private final int age;
    private final String countryName;

    public Register(String name, int age, String countryName) {
        this.name = name;
        this.age = age;
        this.countryName = countryName;
    }

    public void displayInfo() {
        System.out.println("Welcome " + name + ". Your age is " + age + " and you are from " + countryName);
    }
}
