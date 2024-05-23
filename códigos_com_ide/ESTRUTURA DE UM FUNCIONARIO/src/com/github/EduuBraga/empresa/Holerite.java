package com.github.EduuBraga.empresa;

public record Holerite(String nome, String mesAno, double valorSalario) {
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Mês/ano: " + this.mesAno);
        System.out.println("Valor salário: " + this.valorSalario);
    }
}
