package com.github.eduubraga.models;

public abstract class Company {
    private String socialReason;
    private double totalRevenue;

    public Company(String socialReason, double totalRevenue) {
        this.socialReason = socialReason;
        this.totalRevenue = totalRevenue;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
