package com.github.eduubraga.models.financeablecompanies;

import com.github.eduubraga.models.Company;

public abstract class FinanceableCompany extends Company {
    public FinanceableCompany(String socialReason, double totalRevenue) {
        super(socialReason, totalRevenue);
    }

    public abstract double calculateApprovedLimit();
}
