package com.github.eduubraga.services;

import com.github.eduubraga.models.BankableClient;

public class FinancingService {

    public void requestFinancing(BankableClient client, double requestedAmount) {
        double approvedLimit = client.calculateApprovedLimit();
        String clientName = client.getName();
        double interestCalculated = client.calculateInterest(requestedAmount);

        if (requestedAmount > approvedLimit) {
            throw new RuntimeException(String
                    .format("DEBUG: Financiamento de R$ %.2f não aprovado para %s. Limite máximo: R$ %.2f%n",
                            requestedAmount, clientName, approvedLimit));
        }

        System.out.printf(
                "DEBUG: Financiamento de R$ %.2f aprovado para %s com o juros de %.2f%%. Limite máximo R$ %.2f%n",
                requestedAmount, clientName, interestCalculated, approvedLimit);
    }

    public double consultApprovedLimit(BankableClient client) {
        return client.calculateApprovedLimit();
    }

}
