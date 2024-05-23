package com.github.eduubraga.gerenciadorestoque;

public class Shirt implements Storable {
    private final String model;
    private int quantityStock;

    public Shirt(String model, int quantityStock) {
        this.model = model;
        this.quantityStock = quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int getStockQuantity() {
        return quantityStock;
    }
}
