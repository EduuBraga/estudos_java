package com.github.EduuBraga.erp.logistica;

import com.github.EduuBraga.erp.estoque.Product;

public class Pricing {
    public static void addPriceProduct(Product product, double price) {
        if(price < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }

        product.preco = price;
    }
}
