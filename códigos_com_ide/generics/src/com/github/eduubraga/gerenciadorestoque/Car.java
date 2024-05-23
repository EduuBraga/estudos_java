package com.github.eduubraga.gerenciadorestoque;

public class Car implements Storable {
    private final String model;
    private int stockQuantity;

    public Car(String model, int stockQuantity) {
        this.model = model;
        this.stockQuantity = stockQuantity;
    }

    public String getModel() {
        return model;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public int getStockQuantity() {
        return stockQuantity;
    }
}
