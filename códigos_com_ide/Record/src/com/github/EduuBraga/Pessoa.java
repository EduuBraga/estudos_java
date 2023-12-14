package com.github.EduuBraga;

public record Pessoa(String nome, int idade) {
    public Pessoa {
        if(nome.length() < 5){
            throw new IllegalArgumentException("Nome contém menos que 5 caracteres.");
        }

        if(idade < 18){
            throw new IllegalArgumentException("Deve ter mais que 18 anos.");
        }
    }

    public void descricao() {
        System.out.printf("Nome: %s%nIdade: %d%n", nome, idade);
    }
}
