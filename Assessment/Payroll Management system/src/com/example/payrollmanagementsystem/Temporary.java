package com.example.payrollmanagementsystem;

public class Temporary extends Employee{

    private final int dailyWages;
    private final int noOfDays;

    public Temporary(int id, String name, int dailyWages, int noOfDays) {
        super(id, name);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
    }

    float bonus;
    float netSalary=0;

    @Override
    public void payrollDisplay() {
        super.payrollDisplay();
        System.out.println("Daily Wages : " + dailyWages);
        System.out.println("No of Days : " + noOfDays);
        netSalary = dailyWages * noOfDays;
        if(dailyWages<999)
        {
            bonus = (netSalary * 15) / 100;
            System.out.println("Bonus : " + bonus);
        }
        else if(dailyWages<1500 && dailyWages>=1000)
        {
            bonus = (netSalary * 12) / 100;
            System.out.println("Bonus : " + bonus);
        }
        else if(dailyWages<1750 && dailyWages>=1500)
        {
            bonus = (netSalary * 11) / 100;
            System.out.println("Bonus : " + bonus);
        }
        else
        {
            bonus = (netSalary * 8) / 100;
            System.out.println("Bonus : " + bonus);
        }

        System.out.println("Net Salary : " + netSalary);
    }
}
