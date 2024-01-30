package com.github.eduubraga.services;

import com.github.eduubraga.models.financeablecompanies.BankableClient;

public class FinancingService {
    public void requestFinancing(BankableClient client, double requestedAmount) {
        double approvedLimit = client.calculateApprovedLimit();
        String clientName = client.getName();

        if (requestedAmount > approvedLimit) {
            throw new RuntimeException(String
                    .format("DEBUG: Financiamento de %.2f não aprovado para %s. Limite máximo: %.2f%n",
                            requestedAmount, clientName, approvedLimit));
    }

        System.out.printf("DEBUG: Financiamento de %.2f aprovado para %s. Limite máximo %.2f%n",
                requestedAmount, clientName, approvedLimit);
    }

    public double consultApprovedLimit(BankableClient client) {
        return client.calculateApprovedLimit();
    }
}
