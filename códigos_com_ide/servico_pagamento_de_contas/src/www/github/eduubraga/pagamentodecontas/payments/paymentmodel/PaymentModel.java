package www.github.eduubraga.pagamentodecontas.payments.paymentmodel;

import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;

public interface PaymentModel {
    void pay(PayableDocument document);
}
