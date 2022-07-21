package com.example;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> listaContas = new LinkedList<>();

    public String getNome() {
        return this.nome;
    }

    public List<Conta> getListaContas() {
        return this.listaContas;
    }

    public void setListaContas(List<Conta> novaLista) {
        this.listaContas = novaLista;
    }

    public Banco(String nome, List<Conta> listaContas) {
        this.nome = nome;
        this.listaContas = listaContas;
    }

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        this.listaContas.add(conta);
    }

    public void removerConta(Conta conta) {
        this.listaContas.remove(conta);
    }

    public void removerConta(int numeroConta) {
        listaContas.remove(numeroConta);
    }

    public void listarContas() {
        System.out.println("-=-=-=-=-= Relatório de Contas do Banco =-=-=-=-=-=-");
        for (Conta conta : listaContas) {
            System.out.println("");
            conta.mostrarDadosConta();
            System.out.println("");
        }
        System.out.println("\n-=-=-=-=-= Fim do Relatório =-=-=-=-=-=-");
    }
}
