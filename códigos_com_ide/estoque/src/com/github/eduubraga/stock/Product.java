package com.github.eduubraga.stock;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    public enum Status {
        ACTIVE, INACTIVE;
    }

    private String name;
    private BigDecimal price = BigDecimal.ZERO;
    private int quantity;
    private Status status = Status.ACTIVE;

    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price.add(price);
        this.quantity = quantity;
    }

    public Product(String name, BigDecimal price, int quantity, Status status) {
        this(name, price, quantity);
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void inactivate() {
        status = Status.INACTIVE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", status=" + status +
                '}';
    }
}
