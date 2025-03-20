package com.evilcorp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //PEDE PARA O USUÁRIO INSERIR O NOME
        String nome = JOptionPane.showInputDialog("Qual seu nome ? ");

        //CIRA A MENSAGEM
        String mensagem = String.format("Bem vindo, %s a programação Java ", nome);

        //EXIBE A MENSAGEM
        JOptionPane.showMessageDialog(null, mensagem);


    }
}