package www.github.eduubraga.pagamentodecontas.payments.paymentmodel;

import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;
import www.github.eduubraga.pagamentodecontas.payments.Recipient;

public class Pix implements PaymentModel {

    @Override
    public void pay(PayableDocument document) {
        Recipient recipient = document.getRecipient();

        if (recipient.notHaveKeyPix()) {
            throw new RuntimeException("Benéficiario não possui chave pix");
        }

        System.out.printf("DEBUG: Pix realizado para %s no valor de %.2f com a chave pix %s%n",
                recipient.getName(), document.getTotalValue(), recipient.getKeyPix());
    }

}