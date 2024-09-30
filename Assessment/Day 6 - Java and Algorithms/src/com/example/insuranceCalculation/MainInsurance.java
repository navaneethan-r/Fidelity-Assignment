package com.example.insuranceCalculation;
import java.util.*;
public class MainInsurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insurance Number : ");
        String insuranceNo = sc.next();
        System.out.print("Insurance Name : ");
        String insuranceName = sc.nextLine();
        sc.nextLine();
        System.out.print("Amount Covered : ");
        double amountCovered = sc.nextDouble();

        LifeInsurance lifeInsurance = new LifeInsurance(insuranceNo,insuranceName,amountCovered);
        MotorInsurance motorInsurance = new MotorInsurance(insuranceNo,insuranceName,amountCovered);

        while (true) {
            System.out.println();
            System.out.println("Select");
            System.out.println("1. Life Insurance");
            System.out.println("2. Motor Insurance");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter the your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Policy term : ");
                    int policyTerm = sc.nextInt();
                    System.out.print("Benefit Percent : ");
                    float benefitPercent = sc.nextFloat();
                    lifeInsurance.setPolicyTerm(policyTerm);
                    lifeInsurance.setBenefitPercent(benefitPercent);
                    System.out.println("Calculated Premium : " + lifeInsurance.calculatePremium());
                    break;
                case 2:
                    System.out.print("Depreciation Percent : ");
                    float depPercent = sc.nextFloat();
                    motorInsurance.setDepPercent(depPercent);
                    System.out.println("Calculated Premium : " + motorInsurance.calculatePremium());
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Enter the valid option");
            }
        }

    }
}
