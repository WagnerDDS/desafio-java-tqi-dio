package com.example;

public class Main {
    public static void main(String[] args) {

        ClientePf pf = new ClientePf(123, "123.456.789-01", "João da Silva", "(81)9810-0908");
        pf.mostrarDadosCliente();
        // pf.mudarNome("Mario de Andrade");
        // pf.mostrarDadosCliente();

        ClientePj pj = new ClientePj(456, "12.345.567/0001-12", "Padaria do Joaquim", "(81)7899-2354");
        pj.mostrarDadosCliente();
        // pj.mudarRazaoSocial("Padaria do Manoel");
        // pj.mostrarDadosCliente();

        ContaCorrente cc = new ContaCorrente(1234, 12567, 0d, pf);
        ContaPoupanca cp = new ContaPoupanca(1234, 12335, 100d, pf);
        ContaJuridica cj = new ContaJuridica(1234, 13557, 1200d, pj);

        Banco banco = new Banco("BancoDIO");

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cj);

        banco.listarContas();

        System.out.println("Depositando R$20,00 na conta corrente de " + cc.clientepf.getNome());
        cc.depositar(20d);

        System.out.println("Imprimindo extrato para conta corrente de " + cc.clientepf.getNome());
        cc.imprimirExtrato();

        System.out.println("Transferindo R$10,00 para a poupança de " + cp.clientepf.getNome());
        cc.transferir(cp, 10d);
        System.out.println("Imprimindo extrado da poupança de " + cp.clientepf.getNome());
        cp.imprimirExtrato();

        System.out.println("Encerrando Conta Corrente de " + cc.clientepf.getNome());
        banco.removerConta(cc);

        System.out.println("Listando Contas do banco " + banco.getNome());
        banco.listarContas();
    }

}
