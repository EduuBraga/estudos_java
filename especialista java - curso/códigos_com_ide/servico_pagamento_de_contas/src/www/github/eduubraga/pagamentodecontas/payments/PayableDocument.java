package www.github.eduubraga.pagamentodecontas.payments;

public interface PayableDocument {
    double getTotalValue();

    Recipient getRecipient();
}
