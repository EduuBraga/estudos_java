package com.github.eduubraga;

public enum RequestStatus {
    SKETCH {
        @Override
        public boolean canChangeToCanceled(double requestValue) {
            return true;
        }
    },
    ISSUED(12) {
        @Override
        public boolean canChangeToCanceled(double requestValue) {
            return requestValue < 100;
        }
    },
    INVOICED(10) {
        @Override
        public boolean canChangeToCanceled(double requestValue) {
            return false;
        }
    },
    SEPARATE(8) {
        @Override
        public boolean canChangeToCanceled(double requestValue) {
            return false;
        }
    },
    DISPATCHED(6) {
        @Override
        public boolean canChangeToCanceled(double requestValue) {
            return false;
        }
    },
    DELIVERED {
        @Override
        public boolean canChangeToCanceled(double requestValue) {
            return false;
        }
    },
    CANCELED {
        @Override
        public boolean canChangeToCanceled(double requestValue) {
            return false;
        }
    };

    private int deliveryTimeInHours;

    RequestStatus() {
    }

    RequestStatus(int deliveryTimeInHours) {
        this.deliveryTimeInHours = deliveryTimeInHours;
    }

    public int getDeliveryTimeInHours() {
        return deliveryTimeInHours;
    }

    public abstract boolean canChangeToCanceled(double requestValue);
}
