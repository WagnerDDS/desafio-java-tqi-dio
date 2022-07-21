package com.example;

public class ContaPoupanca extends Conta {
    ClientePf clientepf;

    public ContaPoupanca(int agencia, int numero, Double saldo, ClientePf clientepf) {
        super(agencia, numero, saldo);
        this.tipo = Tipo.POUPANCA;
        this.clientepf = clientepf;
    }

    @Override
    public void mostrarDadosConta() {
        System.out.printf("Ag.: %d - conta: %d saldo: %.2f - Cliente: %s", this.agencia, this.numero, this.saldo,
                this.clientepf.getNome());

    }

}
