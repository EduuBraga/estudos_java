package com.github.eduubraga.impostos;

public class PhysicalPerson extends Person {
    public static double ANNUAL_INCOME_EXEMPTION = 50_000;
    public static double INCOME_TAX_RATE = 0.10;
    private double annualRecipe;

    public PhysicalPerson(String name, double annualRecipe) {
        super(name);
        this.annualRecipe = annualRecipe;
    }

    public double getAnnualRecipe(){
        return annualRecipe;
    }

    @Override
    public double calculateTaxes() {
        double resultCalcTax = getAnnualRecipe() * INCOME_TAX_RATE;

        if(getAnnualRecipe() <= ANNUAL_INCOME_EXEMPTION)
            resultCalcTax = 0;

        return resultCalcTax;
    }
}
