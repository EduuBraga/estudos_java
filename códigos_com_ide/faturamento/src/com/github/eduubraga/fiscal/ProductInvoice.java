package com.github.eduubraga.fiscal;

public class ProductInvoice extends Invoice{
    private static final double ALIQUOT_TAXES_FEDERAL = 0.05;
    private static final double ALIQUOT_TAXES_STATE = 0.03;

    private final double freightValue;

    public ProductInvoice(String description, double totalValue, double freightValue){
        super(description, totalValue);
        this.freightValue = freightValue;
    }

    public double getfreightValue() {
        return freightValue;
    }

    @Override
    public double calcTaxes() {
        double resultCalcTaxes = getTotalValue() * ALIQUOT_TAXES_FEDERAL;
        resultCalcTaxes += getTotalValue() * ALIQUOT_TAXES_STATE;

        return resultCalcTaxes;
    }
}
