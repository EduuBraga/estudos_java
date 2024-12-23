package com.github.eduubraga.models;

public class FinancialPartner extends Company {
    private double totalAmountApplied;

    public FinancialPartner(String socialReason, double totalRevenue) {
        super(socialReason, totalRevenue);
    }

    public double getTotalAmountApplied() {
        return totalAmountApplied;
    }

    public void addNewApplication(Double applicationValue) {
        totalAmountApplied += applicationValue;
    }
}
