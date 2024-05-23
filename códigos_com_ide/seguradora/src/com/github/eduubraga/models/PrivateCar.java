package com.github.eduubraga.models;

public class PrivateCar extends MotorVehicle {
    private static final double OLD_VEHICLE_FEE = 0.05;

    public PrivateCar(String model, double marketValue, int yearManufacture) {
        super(model, marketValue, yearManufacture);
    }

    @Override
    public double calculatePremiumValue() {
        double resultCalcPrimiumValue = getMarketValue() * 0.04;

        if (getYearManufacture() < 2000) {
            resultCalcPrimiumValue += (resultCalcPrimiumValue * OLD_VEHICLE_FEE);
        }

        return resultCalcPrimiumValue;
    }

    @Override
    public String toDescribe() {
        return String.format("Carro particular %s ano %d, avaliado em %.2f",
                getModel(),
                getYearManufacture(),
                getMarketValue());
    }
}
