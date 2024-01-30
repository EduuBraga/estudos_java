package com.github.eduubraga.services;

import com.github.eduubraga.models.financeablecompanies.FinanceableCompany;

public class FinancingService {
    public void requestFinancing(FinanceableCompany company, double requestedAmount) {
        double approvedLimit = company.calculateApprovedLimit();
        String socialReason = company.getSocialReason();

        if (requestedAmount > approvedLimit) {
            throw new RuntimeException(String
                    .format("DEBUG: Financiamento não aprovado para %s. Limite máximo: %.2f%n",
                socialReason, approvedLimit));
    }

        System.out.printf("DEBUG: Financiamento aprovado para %s. Limite máximo %.2f%n",
                socialReason,
                approvedLimit);
    }

    public double consultApprovedLimit(FinanceableCompany company) {
        return company.calculateApprovedLimit();
    }
}
