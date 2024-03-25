package com.github.eduubraga.agencia;

import java.util.Objects;

public class Hotel implements Comparable<Hotel> {
    private String name;
    private String city;
    private double dailyPrice;

    public Hotel(String name, String city, double dailyPrice) {
        setName(name);
        setCity(city);
        setDailyPrice(dailyPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name);
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        Objects.requireNonNull(city);
        this.city = city;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        if (dailyPrice < 0) {
            throw new IllegalArgumentException("Preço da diário não pode ser nagativo");
        }

        this.dailyPrice = dailyPrice;
    }

    @Override
    public String toString() {
        return String.format("Hotel(name:\"%s\", city:\"%s\", dailyPrice:%.2f)",
                getName(), getCity(), getDailyPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(name, hotel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Hotel o) {
        return name.compareTo(o.getName());
    }
}