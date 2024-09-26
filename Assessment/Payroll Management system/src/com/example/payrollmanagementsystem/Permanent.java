package com.example.payrollmanagementsystem;

public class Permanent extends Employee {

    private final int pf;
    private final float basicSalary;

    public Permanent(int id, String name, float basicSalary, int pf) {
        super(id, name);
        this.basicSalary = basicSalary;
        this.pf = pf;
    }

    @Override
    public void payrollDisplay() {
        super.payrollDisplay();
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("PF : " + pf);
        float bonus;
        float netSalary = basicSalary - pf;
        if(pf<999)
        {
            bonus = (basicSalary * 10) / 100;
            System.out.println("Bonus : " + bonus);
        }
        else if(pf<1500 && pf>=1000)
        {
            bonus = (float) ((basicSalary * 11.5) / 100);
            System.out.println("Bonus : " + bonus);
        }
        else if(pf<1800 && pf>=1500)
        {
            bonus = (basicSalary * 12) / 100;
            System.out.println("Bonus : " + bonus);
        }
        else
        {
            bonus = (basicSalary * 15) / 100;
            System.out.println("Bonus : " + bonus);
        }
        System.out.println("Net Salary : " + netSalary);
        System.out.println();
    }
}
