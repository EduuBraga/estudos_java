package com.github.eduubraga;

import java.math.BigDecimal;

public class CurrentAccount {
    private BigDecimal balance = BigDecimal.ZERO;

    void toWithdraw(BigDecimal value) {
        if (balance.compareTo(value) < 0) {
            throw new IllegalArgumentException("Saldo insuficiênte para saque. Saldo: %s | Saque: %s"
                    .formatted(balance, value));
        }

        balance = balance.subtract(value);
    }

    void deposit(BigDecimal value) {
        balance = balance.add(value);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
