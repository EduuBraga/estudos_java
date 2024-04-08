package com.github.eduubraga;

public enum RequestStatus {
    SKETCH,
    ISSUED(12),
    INVOICED(10),
    SEPARATE(8),
    DISPATCHED(6),
    DELIVERED,
    CANCELED;

    private int deliveryTimeInHours;

    RequestStatus() {
    }

    RequestStatus(int deliveryTimeInHours) {
        this.deliveryTimeInHours = deliveryTimeInHours;
    }

    public int getDeliveryTimeInHours() {
        return deliveryTimeInHours;
    }

    public boolean canChangeToCanceled(double requestValue) {
        return this.equals(RequestStatus.SKETCH)
                || (this.equals(RequestStatus.ISSUED) && requestValue < 100);
    }
}
