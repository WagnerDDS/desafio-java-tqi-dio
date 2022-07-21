package com.example;

public class ContaJuridica extends Conta {
    ClientePj clientepj;

    public ContaJuridica(int agencia, int numero, Double saldo, ClientePj clientepj) {
        super(agencia, numero, saldo);
        this.tipo = Tipo.JURIDICA;
        this.clientepj = clientepj;
    }

    @Override
    public void mostrarDadosConta() {
        System.out.printf("Ag.: %d - conta: %d saldo: %.2f - Cliente: %s", this.agencia, this.numero, this.saldo,
                this.clientepj.getRazaoSocial());

    }

}
