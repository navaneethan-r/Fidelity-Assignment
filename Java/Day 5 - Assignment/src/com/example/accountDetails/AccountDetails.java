package com.example.accountDetails;
import java.util.*;
public class AccountDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account id : ");
        int accountId = sc.nextInt();
        System.out.print("Enter account type : ");
        String accountType = sc.next();
        sc.nextLine();
        System.out.print("Enter account balance : ");
        double accountBalance = sc.nextDouble();
        System.out.print("Enter amount to withdraw : ");
        double amountWithdraw = sc.nextDouble();

        Account personOne = new Account(accountId,accountType,accountBalance,amountWithdraw);
        personOne.getDetails();
    }
}
