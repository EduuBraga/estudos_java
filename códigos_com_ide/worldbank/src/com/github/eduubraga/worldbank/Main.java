package com.github.eduubraga.worldbank;

import com.javabank.Account;
import com.javabank.CurrentAccount;

public class Main {
    public static void main(String[] args) {
        ScoreAccount scoreAccount = new ScoreAccount(new CurrentAccount());
        Account conta1 = new TaxedAccount(scoreAccount);
        Account conta2 = new CurrentAccount();

        conta1.deposit(1000);
        conta1.transfer(conta2, 200);

        System.out.printf("Saldo conta 1: %.2f%n", conta1.getBalance());
        System.out.printf("Saldo conta 2: %.2f%n", conta2.getBalance());
        System.out.printf("Pontuação conta 1: %d%n", scoreAccount.getScore());
    }
}
