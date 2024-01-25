package www.github.eduubraga.pagamentodecontas.payments.paymentmodel;

import www.github.eduubraga.pagamentodecontas.payments.PayableDocument;
import www.github.eduubraga.pagamentodecontas.payments.Recipient;

public class Transfer implements PaymentModel {

    @Override
    public void pay(PayableDocument document) {
        Recipient recipient = document.getRecipient();

        if (recipient.notHaveBankAccount()) {
            throw new RuntimeException("Benéficiario não possui conta bancaria");
        }

        System.out.printf("DEBUG: tranferencia realizada para %s no valor de %.2f para a conta %s%n",
                recipient.getName(), document.getTotalValue(), recipient.getBankAccount());
    }

}
