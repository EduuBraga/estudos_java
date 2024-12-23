package com.github.eduubraga.worldbank;

import com.github.eduubraga.worldbank.javabank.Account;

public abstract class BaseAccount implements Account {
    private final Account originalAccount;

    public BaseAccount(Account originalAccount) {
        this.originalAccount = originalAccount;
    }

    @Override
    public void toWithdraw(double value) {
        originalAccount.toWithdraw(value);
    }

    @Override
    public void deposit(double value) {
        originalAccount.deposit(value);
    }

    @Override
    public void transfer(Account accountDestination, double value) {
        originalAccount.transfer(accountDestination, value);
    }

    @Override
    public double getBalance() {
        return originalAccount.getBalance();
    }

    public Account getOriginalAccount() {
        return originalAccount;
    }
}
