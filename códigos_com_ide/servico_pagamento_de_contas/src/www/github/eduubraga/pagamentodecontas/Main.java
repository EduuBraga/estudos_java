package www.github.eduubraga.pagamentodecontas;

import www.github.eduubraga.pagamentodecontas.model.Holerite;

import www.github.eduubraga.pagamentodecontas.model.ServiceOrder;
import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;
import www.github.eduubraga.pagamentodecontas.payments.Recipient;
import www.github.eduubraga.pagamentodecontas.service.ServiceAccountPay;

public class Main {
    public static void main(String[] args) {
        ServiceAccountPay serviceAccountPay = new ServiceAccountPay();

        Recipient employee = new Recipient("Eduardo", "06503790322", "4567854");
        PayableDocument holerite = new Holerite(employee, 9, 180);

        Recipient supplier = new Recipient("HP Streetwear", "43275021000144", "4567890");
        PayableDocument serviceOrder = new ServiceOrder(supplier, 10_000);

        serviceAccountPay.pay(holerite);
        serviceAccountPay.pay(serviceOrder);
    }
}
