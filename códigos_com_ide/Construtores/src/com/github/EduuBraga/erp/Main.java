package com.github.EduuBraga.erp;

import com.github.EduuBraga.erp.estoque.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("Cerveja skol 300ML grf C/23");
        Product product3 = new Product("Leite em pó itambé 1KG C/10", 285);

        System.out.printf("%s - R$ %.2f | ID: %s%n", product1.nome, product1.preco, product1.id);
        System.out.printf("%s - R$ %.2f | ID: %s%n", product2.nome, product2.preco, product2.id);
        System.out.printf("%s - R$ %.2f | ID: %s%n", product3.nome, product3.preco, product3.id);
        System.out.printf("Quantidade de produtos cadastrados: %d", Product.quantidadeProdutosCadastrados);
    }
}
