package com.github.eduubraga;

import java.util.Objects;

public class Car {
    private final String plate;
    private final String model;

    public Car(String plate, String model) {
        Objects.requireNonNull(plate);
        Objects.requireNonNull(model);
        this.plate = plate;
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(plate, car.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate);
    }
}
