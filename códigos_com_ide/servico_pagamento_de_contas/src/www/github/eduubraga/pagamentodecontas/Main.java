package www.github.eduubraga.pagamentodecontas;

import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;
import www.github.eduubraga.pagamentodecontas.service.ServiceAccountPay;

public class Main {
    public static void main(String[] args) {
        ServiceAccountPay serviceAccountPay = new ServiceAccountPay();

        PayableDocument document = null;

        serviceAccountpay.pay(document);
    }
}
