package com.github.eduubraga.models;

public interface BankableClient {

    double calculateApprovedLimit();

    String getName();

    default double calculateInterest(double requestedAmount) {
        if (isSmallAmountFinancing(requestedAmount)) {
            return 1.0;
        } else if (isMediumAmountFinancing(requestedAmount)) {
            return 1.5;
        }

        return 2.0; // big amount financing
    }

    private static boolean isMediumAmountFinancing(double requestedAmount) {
        return requestedAmount <= 1_000_000;
    }

    private static boolean isSmallAmountFinancing(double requestedAmount) {
        return requestedAmount <= 100_000;
    }
}