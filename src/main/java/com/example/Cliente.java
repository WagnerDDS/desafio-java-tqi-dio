package com.example;

public abstract class Cliente {
    public enum Tipo {
        PF, PJ
    };

    protected int id;
    protected String fone;
    Tipo tipo;

    public Cliente(int id, String fone) {
        this.id = id;
        this.fone = fone;
        this.fone = fone;
    }

    public void mostrarDadosCliente() {
        System.out.println("-= = = = Dados do Cliente: = = = =-");
        System.out.println("Id: " + this.id);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Fone: " + this.fone);
    }

}
