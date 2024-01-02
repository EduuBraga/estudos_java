package com.github.EduuBraga.empresa;

public class Funcionario {
    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora){
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario(int horasTrabalhadas){
        return horasTrabalhadas * valorHora;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
        double valorSalario = this.calcularSalario(horasTrabalhadas);

        return new Holerite(this.nome, mesAno, valorSalario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }
}