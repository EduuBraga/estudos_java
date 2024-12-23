package com.github.eduubraga.fiscal;

public abstract class Invoice {
    private double totalValue;
    private String description;

    public Invoice(String description, double totalValue) {
        this.totalValue = totalValue;
        this.description = description;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public String getDescription() {
        return description;
    }

    public abstract double calcTaxes();

    public void issue(){
        System.out.printf("Emitindo nota fiscal para: %s%n", getDescription());
        System.out.printf("Valor total: %.2f%n", getTotalValue());
        System.out.printf("Impostos: %.2f%n", calcTaxes());
    }
}
