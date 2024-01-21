package com.github.eduubraga.impostos;

public abstract class LegalPerson extends Person{
    private double annualBilling;
    private double annualExpense;

    public LegalPerson(String name, double annualBilling, double annualExpense) {
        super(name);
        this.annualBilling = annualBilling;
        this.annualExpense = annualExpense;
    }

    public double getAnnualBilling() {
        return annualBilling;
    }

    public double getAnnualExpense() {
        return annualExpense;
    }

    public double getAnnualProfit() {
        return getAnnualBilling() -getAnnualExpense();
    }
}
