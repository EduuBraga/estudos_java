package com.github.EduuBraga;

public class ContaPendente {
    private Fornecedor fornecedor;
    private String descricao;
    private String dataVencimento;
    private double valor;
    private boolean pago;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void pagar() {
        if (isPago()) {
            throw new IllegalArgumentException("Conta já está paga.");
        }

        setPago(true);
    }

    public void cancelarPagamento() {
        if (!isPago()) {
            throw new RuntimeException("Conta não está paga");
        }

        setPago(false);
    }
}