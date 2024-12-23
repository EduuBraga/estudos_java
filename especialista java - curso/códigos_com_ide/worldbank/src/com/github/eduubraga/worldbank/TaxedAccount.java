package com.github.eduubraga.worldbank;

import com.github.eduubraga.worldbank.javabank.Account;

public class TaxedAccount extends BaseAccount {
    public static final double VALUE_TAX_MOVEMENT = 0.03;

    public TaxedAccount(Account originalAccount) {
        super(originalAccount);
    }

    @Override
    public void toWithdraw(double value) {
        getOriginalAccount().toWithdraw(value);
        debitMovementTax(value);
    }

    @Override
    public void transfer(Account accountDestination, double value) {
        getOriginalAccount().transfer(accountDestination, value);
        debitMovementTax(value);
    }

    private void debitMovementTax(double value) {
        getOriginalAccount().toWithdraw(value * VALUE_TAX_MOVEMENT);
    }
}
