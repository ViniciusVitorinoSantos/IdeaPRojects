package com.evilcorp;

public class Conta {
    //Variável de instância.
    private String nome;

    //Construtor
    public Conta() {
        this.nome = getNome();
    }

    //Método para definir o nome no objeto.
    public void setNome(String nome) {
        this.nome = nome; //Armazena o nome.
    }

    //Método para obter o nome do objeto.
    public String getNome() {
        return nome; //Retorna o valor do nome para o chamador.
    }
}
