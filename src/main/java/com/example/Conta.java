package com.example;

public abstract class Conta {
    public enum Tipo {
        CORRENTE, POUPANCA, JURIDICA
    }

    protected int agencia;
    protected int numero;
    protected Double saldo;
    protected Tipo tipo;
    protected Cliente cliente;

    public Conta(int agencia, int numero, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }

    public void depositar(Double valor) {
        this.saldo += valor;
        System.out.println("Depósito bem-sucedido. Salto atual: " + this.saldo);
    }

    public boolean sacar(Double valor) {
        boolean statusOp;
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque bem-sucedido. Salto atual: " + this.saldo);
            statusOp = true;
        } else {
            System.out.println("Seu saldo é insuficiente para sacar esse valor. Saldo atual: " + this.saldo);
            statusOp = false;
        }
        return statusOp;
    }

    public boolean transferir(Conta contaDestino, Double valor) {
        boolean statusOp;
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência bem-sucedida");
            statusOp = true;
        } else {
            System.out.println("Transferência não realizada.");
            statusOp = false;

        }
        return statusOp;
    }

    public void imprimirExtrato() {
        System.out.println(" === == Extrato da sua conta: == === ");
        System.out.println("Ag.: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.println(" === === === === === === === === === \n\n");

    }

    public void mostrarDadosConta() {
        System.out.printf("Ag.: %d - conta: %d saldo: %.2f", this.agencia, this.numero, this.saldo);
    }

}
