package com.github.eduubraga.models;

public class ResidentialProperty implements WellInsurable{
    private double marketValue;
    private double buildingArea;

    public ResidentialProperty(double marketValue, double buildingArea) {
        this.marketValue = marketValue;
        this.buildingArea = buildingArea;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public double getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(double buildingArea) {
        this.buildingArea = buildingArea;
    }

    @Override
    public double calculatePremiumValue() {
        double resultCalcPrimiumValue = getMarketValue() * 0.001;

        resultCalcPrimiumValue += (getBuildingArea() * 0.30);

        return resultCalcPrimiumValue;
    }

    @Override
    public String toDescribe() {
        return String.format("Imovel residencial com %.0fm2, avaliado em %.2f",
                getBuildingArea(),
                getMarketValue());
    }
}
