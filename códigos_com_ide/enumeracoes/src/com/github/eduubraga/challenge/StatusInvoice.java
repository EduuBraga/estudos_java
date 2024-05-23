package com.github.eduubraga.challenge;

public enum StatusInvoice {
    NOT_ISSUED("Not issued"),
    ISSUED("Issued"),
    INVOICED("Invoiced");

    private final String description;

    StatusInvoice(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean canChangeToCanceled(double valueNote){
        return this.equals(StatusInvoice.ISSUED) && valueNote >= 1_000;
    }
}
