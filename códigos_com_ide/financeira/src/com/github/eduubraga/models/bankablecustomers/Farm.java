package com.github.eduubraga.models.bankablecustomers;

import com.github.eduubraga.models.Company;

public class Farm extends Company implements BankableClient {

    public static final double CREDIT_LIMIT_BILLING_PERCENTAGE = 0.5; // 50%
    public static final double MINIMUM_SIZE_IN_HECTARES_LARGE_PROPERTY = 5;
    public static final double FEE_ADDITION_LIMIT_FOR_LARGE_PROPERTY = 1.20; // mais 20%

    private int sizeInHectares;

    public Farm(String socialReason, double totalRevenue, int sizeInHectares) {
        super(socialReason, totalRevenue);
        this.sizeInHectares = sizeInHectares;
    }

    public int getSizeInHectares() {
        return sizeInHectares;
    }

    public void setSizeInHectares(int sizeInHectares) {
        this.sizeInHectares = sizeInHectares;
    }

    @Override
    public double calculateApprovedLimit() {
        double valueApproved = getTotalRevenue() * CREDIT_LIMIT_BILLING_PERCENTAGE;

        if (getSizeInHectares() >= MINIMUM_SIZE_IN_HECTARES_LARGE_PROPERTY)
            valueApproved *= FEE_ADDITION_LIMIT_FOR_LARGE_PROPERTY;

        return valueApproved;
    }

    @Override
    public String getName() {
        return getSocialReason();
    }

}
