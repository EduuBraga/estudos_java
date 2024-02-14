package com.github.eduubraga.worldbank;

import com.javabank.Account;

public class ScoreAccount extends BaseAccount {
    private int score;

    public ScoreAccount(Account accountOriginal) {
        super(accountOriginal);
    }

    @Override
    public void deposit(double value) {
        getOriginalAccount().deposit(value);
        score += (int) (value / 100);
    }

    public int getScore() {
        return score;
    }
}
