package com.Amalitech;

public class BankAccount {

    private double balance;
    private String owner;
    private  String accountNumber;
    protected int numberOfAccounts;

    public BankAccount(){
        balance = 0;
        owner="";
        accountNumber= numberOfAccounts + "";
        numberOfAccounts++;
    }

    public BankAccount(String name, double amount){
        this.owner = name;
        this.balance = amount;
        accountNumber = "100001";
        numberOfAccounts++;
    }
    public BankAccount(BankAccount oldAccount, double amount){
        this.owner = oldAccount.owner;
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setBalance( double amount){
        this.balance = amount;
    }
    public void setAccountNumber(String newAccountNumber){
        this.accountNumber = newAccountNumber;
    }

    public void deposit(double amount){
        double newBalance = getBalance();
        newBalance += amount;
        setBalance(newBalance);
    }

    public boolean withdraw(double amount){
        boolean successful = false;
        double newBalance = getBalance();
        if (newBalance >= amount){
            newBalance -= amount;
            setBalance(newBalance);
            successful = true;
        }
        return successful;
    }
}
