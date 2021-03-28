package com.Amalitech;

public class CheckingAccount extends BankAccount{
    private final static double FEE = 0.25;

    public CheckingAccount(String name, double amount) {
        super(name, amount);
        setAccountNumber(getAccountNumber() +"10");
    }

    @Override
    public boolean withdraw(double amount) {
        amount += FEE;
        return super.withdraw(amount);
    }
}
