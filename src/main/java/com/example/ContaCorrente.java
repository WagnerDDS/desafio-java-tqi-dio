package com.example;

public class ContaCorrente extends Conta {
    ClientePf clientepf;

    public ContaCorrente(int agencia, int numero, Double saldo, ClientePf clientepf) {
        super(agencia, numero, saldo);
        this.tipo = Tipo.CORRENTE;
        this.clientepf = clientepf;

    }

    @Override
    public void mostrarDadosConta() {
        System.out.printf("Ag.: %d - conta: %d saldo: %.2f - Cliente: %s", this.agencia, this.numero, this.saldo,
                this.clientepf.getNome());
    }

}
