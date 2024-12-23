package com.github.eduubraga.worldbank.javabank;

public interface Account {
    void toWithdraw(double value);

    void deposit(double value);

    void transfer(Account accountDestination, double value);

    double getBalance();
}
