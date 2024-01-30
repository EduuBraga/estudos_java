package com.github.eduubraga.models.financeablecompanies;

import com.github.eduubraga.models.financeablecompanies.FinanceableCompany;

public class Industry extends FinanceableCompany {
    public static final double CREDIT_LIMIT_BILLING_PERCENTAGE = 0.5; // 50%
    public static final double ADDITIONAL_RATE_LIMIT_SUSTAINABLE_INDUSTRY = 1.2; // Mais 20%

    private boolean comprensatesCo2Emissions;

    public Industry(String socialReason, double totalRevenue, boolean comprensatesCo2Emissions) {
        super(socialReason, totalRevenue);
        this.comprensatesCo2Emissions = comprensatesCo2Emissions;
    }

    public boolean isComprensatesCo2Emissions() {
        return comprensatesCo2Emissions;
    }

    public void setComprensatesCo2Emissions(boolean comprensatesCo2Emissions) {
        this.comprensatesCo2Emissions = comprensatesCo2Emissions;
    }

    @Override
    public double calculateApprovedLimit() {
        double valueApproved = getTotalRevenue() * CREDIT_LIMIT_BILLING_PERCENTAGE;

        if (isComprensatesCo2Emissions())
            valueApproved *= ADDITIONAL_RATE_LIMIT_SUSTAINABLE_INDUSTRY;

        return valueApproved;
    }
}
