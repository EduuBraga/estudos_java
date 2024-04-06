package com.github.eduubraga;

public class Request {
    public static final int STATUS_SKETCH = 0;
    public static final int STATUS_ISSUED = 1;
    public static final int STATUS_INVOICED = 2;
    public static final int STATUS_DELIVERED = 3;
    public static final int STATUS_CANCELED = 4;

    public static final int ORIGIN_COUNTER = 100;
    public static final int ORIGIN_ONLINE = 101;

    private String nameClient;
    private int status = 0;
    private int origin = 0;

    public Request(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if (status < STATUS_SKETCH || status > STATUS_CANCELED) {
            throw new IllegalArgumentException("Status inválido");
        }

        this.status = status;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        if (origin < ORIGIN_COUNTER || origin > ORIGIN_ONLINE) {
            throw new IllegalArgumentException("Origem inválida");
        }

        this.origin = origin;
    }

    public String getDescriptionStatus(int status) {
        return switch (status) {
            case STATUS_SKETCH -> "Rascunho";
            case STATUS_ISSUED -> "Emitido";
            case STATUS_INVOICED -> "Faturado";
            case STATUS_DELIVERED -> "Entregue";
            case STATUS_CANCELED -> "Cancelado";
            default -> throw new IllegalStateException("Status inválido: " + status);
        };
    }
}
