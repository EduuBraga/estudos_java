package com.github.eduubraga.rentalcompany;

import java.util.Objects;

public class Location {
    private Notebook notebook;
    private Pricing pricing;
    private Safe safe;

    public Location(Notebook notebook, Pricing pricing) {
        Objects.requireNonNull(notebook);
        Objects.requireNonNull(pricing);

        this.notebook = notebook;
        this.pricing = pricing;
    }

    public Location(Notebook notebook, Pricing pricing, Safe safe) {
        this(notebook, pricing);
        this.safe = safe;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public Safe getSafe() {
        return safe;
    }

    private boolean haveInsurance() {
        return safe != null;
    }

    public double calcAmountDue(int hoursUsed) {
        double result = getPricing().calculate(getNotebook(), hoursUsed);

        if (haveInsurance()) {
            result += getSafe().calcPremium(hoursUsed, result);
        }

        return result;
    }
}
