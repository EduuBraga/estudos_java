package com.github.eduubraga.impostos;

public class CompanyRealProfit extends LegalPerson{
    public static double TAX_RATE_PROFIT = 0.25;

    public CompanyRealProfit(String name, double annualBilling, double annualExpense) {
        super(name, annualBilling, annualExpense);
    }

    @Override
    public double calculateTaxes() {
        double resultCalcTax = getAnnualProfit() * TAX_RATE_PROFIT;

        return resultCalcTax;
    }
}
