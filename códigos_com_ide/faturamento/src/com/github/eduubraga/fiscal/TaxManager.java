package com.github.eduubraga.fiscal;

public class TaxManager {
    public void issueInvoices(Invoice... invoices) {
        for (int i = 0; i < invoices.length; i++) {
            Invoice invoice = invoices[i];

            if(i == 0)
                System.out.println("-----------------");

            invoice.issue();
            System.out.println("-----------------");
        }
    }
}
