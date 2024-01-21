package com.github.eduubraga.fiscal;

public class Main {
    public static void main(String[] args) {
        var taxManager = new TaxManager();

        var invoiceFixScreen = new ServiceInvoice("consertar tela notebook", 250, false);
        var invoiceMouse = new ProductInvoice("mouse logitech", 180, 26.99);

        taxManager.issueInvoices(invoiceMouse, invoiceFixScreen);
    }
}
