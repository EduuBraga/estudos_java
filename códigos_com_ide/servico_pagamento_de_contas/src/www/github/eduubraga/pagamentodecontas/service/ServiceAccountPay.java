package www.github.eduubraga.pagamentodecontas.service;

import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;
import www.github.eduubraga.pagamentodecontas.payments.paymentmodel.PaymentModel;

public class ServiceAccountPay {
    private final PaymentModel paymentModel;

    public ServiceAccountPay(PaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }

    public void pay(PayableDocument document) {
        paymentModel.pay(document);
    }
}
