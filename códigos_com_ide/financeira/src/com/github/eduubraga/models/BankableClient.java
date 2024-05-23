package com.github.eduubraga.models;

public interface BankableClient {

    double LOW_RISK_INTEREST = 1.0;
    double AVERAGE_RISK_INTEREST = 1.5;
    double BIG_RISK_INTEREST = 2.0;

    double calculateApprovedLimit();

    String getName();

    default double calculateInterest(double requestedAmount) {
        if (isSmallAmountFinancing(requestedAmount)) {
            return LOW_RISK_INTEREST;
        } else if (isMediumAmountFinancing(requestedAmount)) {
            return AVERAGE_RISK_INTEREST;
        }

        return BIG_RISK_INTEREST; // big amount financing
    }

    private static boolean isMediumAmountFinancing(double requestedAmount) {
        return requestedAmount <= 1_000_000;
    }

    private static boolean isSmallAmountFinancing(double requestedAmount) {
        return requestedAmount <= 100_000;
    }
}