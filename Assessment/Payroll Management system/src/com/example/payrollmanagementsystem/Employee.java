package com.example.payrollmanagementsystem;

public class Employee {

    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void payrollDisplay(){
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}
