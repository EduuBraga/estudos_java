package com.github.eduubraga.bank.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Objects;

public class CurrentAccount {
    private static final Logger logger = LoggerFactory.getLogger(CurrentAccount.class);

    private final Holder holder;
    private final int agency;
    private final int number;
    private BigDecimal balance = BigDecimal.ZERO;

    public CurrentAccount(Holder holder, int agency, int number) {
        Objects.requireNonNull(holder);
        this.holder = holder;
        this.agency = agency;
        this.number = number;
    }

    public Holder getHolder() {
        return holder;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }
    
    public final BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.doubleValue() <= 0) {
            throw new IllegalArgumentException("Valor de deposito deve ser maior que 0");
        }

        setBalance(balance.add(depositAmount));

        logger.debug("Utilizando método de depósito.");
        logger.info("Depósito de {} realizado na conta {}/{}",
                depositAmount, getAgency(), getNumber());
    }

    public void withdath(BigDecimal withdrawalAmount) {
        if (withdrawalAmount.doubleValue() <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }
        if (withdrawalAmount.doubleValue() > getBalance().doubleValue()) { //comparando se saldo é negartivo ou zero.
            throw new InsufficientFundsException("Saldo insuficiênte");
        }

        setBalance(balance.subtract(withdrawalAmount));

        logger.debug("Utilizando método  de saque.");
        logger.info("Saque de {} realizado na conta {}/{}",
                withdrawalAmount, getAgency(), getNumber());
    }

    @Override
    public String toString() {
        return "Account[" +
                "Holder:" + holder +
                ", agency:" + agency +
                ", number:" + number +
                ", balance:" + balance +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentAccount account = (CurrentAccount) o;
        return agency == account.agency && number == account.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency, number);
    }
}
