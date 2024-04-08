package com.github.eduubraga;

public enum RequestStatus {
    SKETCH(),
    ISSUED(12),
    INVOICED(10),
    DISPATCHED(8),
    SEPARATE(6),
    DELIVERED(),
    CANCELED();

    private int deliveryTimeInHours;

    RequestStatus() {
    }

    RequestStatus(int deliveryTimeInHours) {
        this.deliveryTimeInHours = deliveryTimeInHours;
    }

    public int getDeliveryTimeInHours() {
        return deliveryTimeInHours;
    }
}
