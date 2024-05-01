package com.github.eduubraga.bankservice;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Transaction makePayment(BigDecimal value) {
        BigDecimal tax = value.multiply(new BigDecimal("0.03"));
        balance = balance.subtract(value).subtract(tax);

        class Payment implements Transaction{
            @Override
            public BigDecimal getValueTotal() {
                return value.add(tax);
            }

            @Override
            public void reimbursement() {
                balance = balance.add(value).add(tax);
            }
        }

        return new Payment();
    }

    public Transaction chargeAFee(BigDecimal valueTax) {
        balance = balance.subtract(valueTax);

        class Tax implements Transaction{
            @Override
            public BigDecimal getValueTotal() {
                return valueTax;
            }

            @Override
            public void reimbursement() {
                balance = balance.add(valueTax);
            }
        }

        return new Tax();
    }
}
