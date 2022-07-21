package com.example;

public class ClientePf extends Cliente {
    private String nome;
    private String cpf;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public ClientePf(int id, String cpf, String nome, String fone) {
        super(id, fone);
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = Tipo.PF;
        this.fone = fone;
    }

    public void mudarNome(String novoNome) {
        this.setNome(novoNome);
    }

    @Override
    public void mostrarDadosCliente() {
        super.mostrarDadosCliente();
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("-= = = = = = = = = = = = = = = =-");

    }

}
