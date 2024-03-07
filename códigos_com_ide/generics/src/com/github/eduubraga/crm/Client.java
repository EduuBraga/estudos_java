package com.github.eduubraga.crm;

public class Client implements Nameable{
    private String reason;
    private double monthlyBilling;

    public Client(String reason, double monthlyBilling) {
        this.reason = reason;
        this.monthlyBilling = monthlyBilling;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public double getMonthlyBilling() {
        return monthlyBilling;
    }

    public void setMonthlyBilling(double monthlyBilling) {
        this.monthlyBilling = monthlyBilling;
    }

    @Override
    public String getName() {
        return getReason();
    }
}
