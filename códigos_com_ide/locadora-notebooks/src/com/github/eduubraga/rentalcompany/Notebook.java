package com.github.eduubraga.rentalcompany;

public class Notebook {
    private String description;
    private double priceHour;
    private double priceDay;

    public Notebook(String description, double priceHour, double priceDay) {
        this.description = description;
        this.priceHour = priceHour;
        this.priceDay = priceDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }

    public double getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(double priceDay) {
        this.priceDay = priceDay;
    }
}
