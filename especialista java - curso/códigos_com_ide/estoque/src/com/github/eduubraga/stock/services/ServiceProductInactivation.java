package com.github.eduubraga.stock.services;

import com.github.eduubraga.stock.Product;

public class ServiceProductInactivation {

    public void process(Product product) {
        System.out.println("Inativação do produto " + product.getName() + " realizada com sucesso!");

        product.inactivate();
    }

}
