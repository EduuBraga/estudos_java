package com.github.eduubraga;

public class Request {
    private String nameClient;
    private RequestStatus status = RequestStatus.SKETCH;
    private OriginRequest origin = OriginRequest.COUNTER;

    public Request(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public OriginRequest getOrigin() {
        return origin;
    }

    public void setOrigin(OriginRequest origin) {
        this.origin = origin;
    }

    public int getDeliveryTimeInHours() {
        return status.getDeliveryTimeInHours();
    }
}
