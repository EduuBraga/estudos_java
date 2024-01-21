package com.github.eduubraga.fiscal;

public class Main {
    public static void main(String[] args) {
        ServiceInvoice invoiceFixScreen = new ServiceInvoice("consertar tela notebook", 250, false);
        ProductInvoice invoiceMouse = new ProductInvoice("mouse logitech", 180, 26.99);

        System.out.println(invoiceFixScreen.calcTaxes());
        System.out.println(invoiceMouse.calcTaxes());
        invoiceMouse.issue();
    }
}
