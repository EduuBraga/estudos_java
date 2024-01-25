package www.github.eduubraga.pagamentodecontas.model;

import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;
import www.github.eduubraga.pagamentodecontas.payments.Recipient;

public class ServiceOrder implements PayableDocument {
    private Recipient supplier;
    private double totalValue;

    public ServiceOrder(Recipient supplier, double totalValue) {
        this.supplier = supplier;
        this.totalValue = totalValue;
    }

    public Recipient getSupplier() {
        return supplier;
    }

    @Override
    public double getTotalValue() {
        return totalValue;
    }

    @Override
    public Recipient getRecipient() {
        return getSupplier();
    }
}
