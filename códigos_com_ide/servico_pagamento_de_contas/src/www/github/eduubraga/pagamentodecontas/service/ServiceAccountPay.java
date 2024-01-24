package www.github.eduubraga.pagamentodecontas.service;

import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;
import www.github.eduubraga.pagamentodecontas.payments.Recipient;

public class ServiceAccountPay {
    public void pay(PayableDocument document) {
        Recipient recipient = document.getRecipient();

        if (!recipient.itHasKeyPix()) {
            throw new RuntimeException("Benéficiario não possui chave pix");
        }

        System.out.printf("DEBUG: Pix realizado para %s no valor de %.2f com a chave pix %s%n",
                recipient.getName(), document.getTotalValue(), recipient.getKeyPix());
    }
}
