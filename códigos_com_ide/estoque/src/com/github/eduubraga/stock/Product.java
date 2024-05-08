package com.github.eduubraga.stock;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    public enum Status {
        ACTIVE, INACTIVE;
    }

    private String name;
    private BigDecimal price;
    private int quantity;
    private Status status = Status.ACTIVE;
    private Supplier supplier;
    private final Set<Category> categories = new HashSet<>();

    public Product(String name, BigDecimal price, int quantity, Supplier supplier, Category... categories) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.supplier = supplier;
        this.categories.addAll(Set.of(categories));
    }

    public Product(String name, BigDecimal price, int quantity, Status status,
                   Supplier supplier, Category... categories) {
        this(name, price, quantity, supplier, categories);
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

    public void activate() {
        status = Status.ACTIVE;
    }

    public void inactivate() {
        status = Status.INACTIVE;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Set<Category> getCategories() {
        return Collections.unmodifiableSet(categories);
    }

    public void addCategory(Category category) {
        this.categories.add(category);
    }

    public void removeCategory(Category category) {
        this.categories.remove(category);
    }

    public boolean haveStock() {
        return this.quantity > 0;
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
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", status=" + status +
                ", supplier=" + supplier +
                ", categories=" + categories +
                '}';
    }
}
