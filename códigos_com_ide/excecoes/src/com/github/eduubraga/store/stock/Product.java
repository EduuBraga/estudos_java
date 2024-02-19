package com.github.eduubraga.store.stock;

import com.github.eduubraga.store.stock.exceptions.InactiveProductException;
import com.github.eduubraga.store.stock.exceptions.ProductOutStockException;

import java.util.Objects;

public class Product {
    private String name;
    private int quantityInStock;
    private boolean active;

    public Product(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "Nome deve ser informado.");
        this.name = name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public boolean isActive() {
        return active;
    }

    private boolean isInactive() {
        return !isActive();
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void removeStock(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("A quantidade de produto à remover não pode ser negativa");
        }

        if (isInactive()) {
            throw new InactiveProductException("Produto inativo, movimentação indisponível.");
        }

        if(this.quantityInStock - quantity < 0){
            throw new ProductOutStockException("Quantidade a remover maio¹¹r que quantidade em estoque");
        }

        this.quantityInStock -= quantity;
    }

    public void addStock(int quantity) {
        this.quantityInStock += quantity;
    }
}