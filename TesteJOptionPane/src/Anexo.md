→ O JOptionPane é uma classe da biblioteca Swing do java, utilizada para criar diálogos interativos com o usuário. Ela simplifica o processo de exibir mensagens, coletar entradas de dados ou oferecer opções para seleção em uma janela gráfica, sem a necessidade de criar uma interface gráfica complexa. 

→ Logo abaixo temos o modelo do código para a coleta simples de dados basta copiar e colar dentro de Main 
```java
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
```