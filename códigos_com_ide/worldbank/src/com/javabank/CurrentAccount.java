package com.javabank;

public class CurrentAccount implements Account{
    private double balance;

    @Override
    public void toWithdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void transfer(Account accountDestination, double value) {
        toWithdraw(value);
        accountDestination.deposit(value);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
