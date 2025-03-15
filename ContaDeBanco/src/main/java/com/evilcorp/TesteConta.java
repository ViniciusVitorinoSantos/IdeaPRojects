package com.evilcorp;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta c1 = new Conta();

        //Exibe o valor inicial do nome.
        System.out.printf("Nome inicial é : %s%n%n", c1.getNome());

        //Solicita o nome
        System.out.println("Por favor insira o nome :");
        String nome = input.nextLine();
        c1.setNome(nome);

        //Exibe o nome armazenado no objeto c1.
        System.out.printf("O nome no objeto c1 é: %s%n%n", c1.getNome());

    }
}