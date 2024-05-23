package com.github.EduuBraga.banco;

import java.util.Objects;

public class Titular {
    private String nome;
    private final String cpf;

    public Titular(String nome, String cpf) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(cpf);

        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Titular[" +
                "nome:'" + nome + '\'' +
                ", cpf:'" + cpf + '\'' +
                ']';
    }
}
