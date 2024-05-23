package com.github.eduubraga.impostos;

public class SimpleCompany extends LegalPerson {
    public static double BILLING_TAX_RATE = 0.15;

    public SimpleCompany(String name, double annualBilling, double annualExpense) {
        super(name, annualBilling, annualExpense);
    }

    @Override
    public double calculateTaxes() {
        double resultCalcTax = getAnnualBilling() * BILLING_TAX_RATE;

        return resultCalcTax;
    }
}
