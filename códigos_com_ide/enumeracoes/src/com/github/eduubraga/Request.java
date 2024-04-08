package com.github.eduubraga;

public class Request {
    private String nameClient;
    private double totalValue;

    private RequestStatus status = RequestStatus.SKETCH;
    private OriginRequest origin = OriginRequest.COUNTER;

    public Request(String nameClient, double totalValue) {
        this.nameClient = nameClient;
        this.totalValue = totalValue;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public OriginRequest getOrigin() {
        return origin;
    }

    public void setOrigin(OriginRequest origin) {
        this.origin = origin;
    }

    public void issue() {
        status = RequestStatus.ISSUED;
    }

    public void invoice() {
        status = RequestStatus.INVOICED;
    }

    public void toSeparate() {
        status = RequestStatus.SEPARATE;
    }

    public void dispatch() {
        status = RequestStatus.DISPATCHED;
    }

    public void delivered() {
        status = RequestStatus.DELIVERED;
    }

    public void cancel() {
        if (getStatus().equals(RequestStatus.SKETCH) ||
                (getStatus().equals(RequestStatus.ISSUED) && getTotalValue() < 100)) {
            status = RequestStatus.CANCELED;
        } else {
            throw new IllegalStateException("Pedido não pode ser cancelado");
        }
    }

    public int getDeliveryTimeInHours() {
        return status.getDeliveryTimeInHours();
    }
}
