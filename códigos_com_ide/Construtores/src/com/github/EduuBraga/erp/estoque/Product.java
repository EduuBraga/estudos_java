package com.github.EduuBraga.erp.estoque;

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
        validandoArgumentosConstrutores(nome, preco);

        quantidadeProdutosCadastrados++;

        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.preco = preco;
    }

    private static void validandoArgumentosConstrutores(String nome, double preco){
        Objects.requireNonNull(nome, "O produto deve ter um nome");

        if(preco < 0){
            throw new IllegalArgumentException("O preco não deve ser vazio");
        }
    }
}
