package com.github.eduubraga.models.bankablecustomers;

public interface BankableClient {

    double calculateApprovedLimit();

    String getName();

    default double calculateInterest(double requestedAmount) {
        if (requestedAmount <= 100_000) {
            return 1.0;
        } else if (requestedAmount <= 1_000_000) {
            return 1.5;
        }

        return 2.0;
    }
}