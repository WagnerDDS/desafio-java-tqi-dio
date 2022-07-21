package com.example;

public class ClientePj extends Cliente {
    private String razaoSocial;
    private String cnpj;

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String novoNome) {
        this.razaoSocial = novoNome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public ClientePj(int id, String cnpj, String razaoSocial, String fone) {
        super(id, fone);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.tipo = Tipo.PJ;
        this.fone = fone;
    }

    public void mudarRazaoSocial(String novoNome) {
        this.setRazaoSocial(novoNome);
    }

    @Override
    public void mostrarDadosCliente() {
        super.mostrarDadosCliente();
        System.out.println("Razão Social: " + this.getRazaoSocial());
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("-= = = = = = = = = = = = = = = =-");
    }

}
