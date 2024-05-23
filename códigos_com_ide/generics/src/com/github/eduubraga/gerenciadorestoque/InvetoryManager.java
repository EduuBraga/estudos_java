package com.github.eduubraga.gerenciadorestoque;

public class InvetoryManager<T extends Storable> {
    private int qtyStock;

    public void add(T item) {
        qtyStock += item.getStockQuantity();
    }

    public int getTotalStockQuantity() {
        return qtyStock;
    }
}
