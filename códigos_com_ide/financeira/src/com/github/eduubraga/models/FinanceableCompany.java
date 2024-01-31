package com.github.eduubraga.models;

public abstract class FinanceableCompany extends Company implements BankableClient {
    public FinanceableCompany(String socialReason, double totalRevenue) {
        super(socialReason, totalRevenue);
    }

    @Override
    public double calculateInterest(double requestedAmount) {
        return 0.8; // Toda empresa financiável tem o juros de 8%
    }
}
