package com.github.eduubraga.models;

public abstract class MotorVehicle implements WellInsurable {
    private String model;
    private double marketValue;
    private int yearManufacture;

    public MotorVehicle(String model, double marketValue, int yearManufacture) {
        this.model = model;
        this.marketValue = marketValue;
        this.yearManufacture = yearManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }
}
