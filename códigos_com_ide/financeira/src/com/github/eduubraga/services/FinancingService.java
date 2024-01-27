package com.github.eduubraga.services;

import com.github.eduubraga.models.Company;

public class FinancingService {
    public void requestFinancing(Company company, double requestedAmount) {
        double approvedLimit = company.calculateApprovedLimit();

        if (requestedAmount > approvedLimit) {
            throw new RuntimeException(String
                    .format("DEBUG: Financiamento não aprovado. Limite máximo: %.2f%n", approvedLimit));
        }

        System.out.printf("DEBUG: Financiamento aprovado. Limite máximo %.2f%n",
                approvedLimit);
    }
}
