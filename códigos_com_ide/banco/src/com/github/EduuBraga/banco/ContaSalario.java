package com.github.EduuBraga.banco;

public class ContaSalario extends Conta {
    private double salario;

    public ContaSalario(Titular titular, int agencia, int numero, double salario) {
        super(titular, agencia, numero);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Salário: " + salario);
    }
}
