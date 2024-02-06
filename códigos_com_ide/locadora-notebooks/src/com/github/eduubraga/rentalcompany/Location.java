package com.github.eduubraga.rentalcompany;

public class Location {
    private Notebook notebook;
    private Pricing pricing;

    public Location(Notebook notebook, Pricing pricing) {
        this.notebook = notebook;
        this.pricing = pricing;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public double calcAmountDue(int hoursUsed) {
        double result = getPricing().calculate(getNotebook(), hoursUsed);

        return result;
    }
}
