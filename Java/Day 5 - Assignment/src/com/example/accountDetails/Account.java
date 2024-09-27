package com.example.accountDetails;

public class Account {
    private final int id;
    private final String accountType;
    private final double balance;
    private final double withdraw;

    public int getId() {
        return id;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public Account() {
        this.id = 0;
        this.accountType = null;
        this.balance = 0;
        this.withdraw = 0;
    }

    public Account(int id, String accountType, double balance, double withdraw) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
        this.withdraw = withdraw;
    }

    public void getWithdrawBalance(){
        if(balance>withdraw)
        {
            System.out.println("New Balance : " + (balance - withdraw));
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public void getDetails(){
        System.out.println("Account Id : "+ getId());
        System.out.println("Account Type : "+ getAccountType());
        System.out.println("Balance : "+ getBalance());
        getWithdrawBalance();
    }
}
