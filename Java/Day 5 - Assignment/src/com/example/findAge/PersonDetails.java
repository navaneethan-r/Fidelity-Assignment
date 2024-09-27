package com.example.findAge;
import java.util.*;
public class PersonDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();
        System.out.print("Enter your date of birth (yyyy/mm/dd) : ");
        String dob = sc.nextLine();

        Person personOne = new Person(firstName,lastName,dob);
        personOne.getDetails();
    }
}
