package com.github.eduubraga.models.financeablecompanies;

import com.github.eduubraga.models.financeablecompanies.FinanceableCompany;

public class RetailStore extends FinanceableCompany {
    private static final double CREDIT_LIMIT_BILLING_PERCENTAGE = 0.2; // 20%
    private static final double PERCENTAGE_VALUE_STOCK_CREDIT_LIMIT = 0.4; // 40%

    private double totalStockValue;

    public RetailStore(String socialReason, double totalRevenue) {
        super(socialReason, totalRevenue);
    }

    public double getTotalStockValue() {
        return totalStockValue;
    }

    public void setTotalStockValue(double totalStockValue) {
        this.totalStockValue = totalStockValue;
    }

    @Override
    public double calculateApprovedLimit() {
        return (getTotalRevenue() * CREDIT_LIMIT_BILLING_PERCENTAGE)
                + (getTotalStockValue() * PERCENTAGE_VALUE_STOCK_CREDIT_LIMIT);
    }
}
