package com.github.EduuBraga;

public class Receipt {
    public String titular;
    public double valor;

    public Receipt(String titular, double valor){
        this.titular = titular;
        this.valor = valor;
    }

    public void imprimirDescricaoDeposito() {
        System.out.println("--------------------");
        System.out.printf("Recebido para %s%n", titular);
        System.out.printf("Depositou %.2f%n", valor);
        System.out.println("--------------------");
    }

    public void imprimirDescricaoTransacao() {
        System.out.println("--------------------");
        System.out.printf("Recebido para %s%n", titular);
        System.out.printf("Efetuou pagamento de %.2f%n", valor);
        System.out.println("--------------------");
    }
}
