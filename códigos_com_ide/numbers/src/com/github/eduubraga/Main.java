package com.github.eduubraga;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount();
        account.deposit(new BigDecimal("1.0"));

        account.toWithdraw(new BigDecimal("0.10"));
        account.toWithdraw(new BigDecimal("0.20"));
        account.toWithdraw(new BigDecimal("0.30"));
        account.toWithdraw(new BigDecimal("0.41"));

        System.out.println(account.getBalance());
    }
}
