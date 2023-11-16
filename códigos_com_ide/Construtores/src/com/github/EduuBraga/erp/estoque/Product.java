package com.github.EduuBraga.erp.estoque;

import static com.github.EduuBraga.erp.logistica.Pricing.addPriceProduct;

import java.util.Objects;
import java.util.UUID;

public class Product {
    private static final double PRECO_PADRAO = 1;
    public static int quantidadeProdutosCadastrados;

    public final String id;
    public String nome;
    public double preco;

    public Product() {
        this("Sem nome");
    }

    public Product(String nome) {
        this(nome, PRECO_PADRAO);
    }

    public Product(String nome, double preco) {
        quantidadeProdutosCadastrados++;

        validandoNome(nome);

        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        addPriceProduct(this, preco);
    }

    private static void validandoNome(String nome) {
        Objects.requireNonNull(nome, "O produto deve ter um nome");
    }
}
