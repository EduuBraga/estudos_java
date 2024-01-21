package com.github.eduubraga.fiscal;

public class ServiceInvoice extends Invoice {
    private static final double MAXIMUM_TAX_EXEMPTION_AMOUNT = 1_000;
    private static final double ALIQUOT_TAXES = 0.03;

    private boolean intercity;

    public ServiceInvoice(String description, double totalValue, boolean intercity) {
        super(description, totalValue);
        this.intercity = intercity;
    }

    public boolean isIntercity() {
        return intercity;
    }

    @Override
    public double calcTaxes() {
        double resultCalcTaxes = getTotalValue() * ALIQUOT_TAXES;

        if(isTaxExempt())
            resultCalcTaxes  = 0;

        return resultCalcTaxes;
    }

    private boolean isTaxExempt() {
        return isIntercity() && getTotalValue() <= MAXIMUM_TAX_EXEMPTION_AMOUNT;
    }
}
