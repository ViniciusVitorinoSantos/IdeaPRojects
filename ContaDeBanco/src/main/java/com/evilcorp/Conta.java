package com.evilcorp;

public class Conta {
    
    //Construtor
    public Conta(){
        this.nome = "Sem nome";
    }

    //Atributos
    private String nome;

    //Métodos get / set
    public String getNome(){
        return  nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
