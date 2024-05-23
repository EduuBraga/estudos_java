package com.github.eduubraga.challenge;

public class Invoice {
    private double value;
    private StatusInvoice status;
    private String description;
    private final int number;
    private static int counterNumber;

    public Invoice(double value, String description) {
        this.value = value;
        this.description = description;
        number = (counterNumber++) + 1;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }

    public StatusInvoice getStatus() {
        return status;
    }

    public void cancel(){}

    public void issue(){}
}
