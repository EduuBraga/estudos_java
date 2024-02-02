package com.github.eduubraga.models;

public class Truck extends MotorVehicle {
    private int amountAxes;

    public Truck(String model, double marketValue, int yearManufacture, int amountAxes) {
        super(model, marketValue, yearManufacture);
        this.amountAxes = amountAxes;
    }

    public int getAmountAxes() {
        return amountAxes;
    }

    public void setAmountAxes(int amountAxes) {
        this.amountAxes = amountAxes;
    }

    @Override
    public double calculatePremiumValue() {
        double resultCalcPrimiumValue = getMarketValue() * 0.02;
        resultCalcPrimiumValue += (50 * getAmountAxes());
        return resultCalcPrimiumValue;
    }

    @Override
    public String toDescribe() {
        return String.format("Caminhão %s ano %d, avaliado em %.2f",
                getModel(),
                getYearManufacture(),
                getMarketValue());
    }
}
