package com.example.findAge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String dob;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public Person(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public void getAge(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period ageCalculate = Period.between(birthDate, currentDate);
        age = ageCalculate.getYears();
        System.out.println("Age : " + age);
    }

    public void getAgeCategory(){
        String ageCategory = (age>=18) ? "Adult" : "Child";
        System.out.println(ageCategory);
    }

    public void getDetails(){
        System.out.println("First name : " + getFirstName());
        System.out.println("Last name : " + getLastName());
        getAge();
        getAgeCategory();
    }
}
