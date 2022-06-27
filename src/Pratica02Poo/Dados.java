package Pratica02Poo;

import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String pessoaNome = sc.next();
        System.out.println("Digite sua idade");
        int pessoaIdade = sc.nextInt();
        Pessoa p1 = new Pessoa();
        p1.mostra(pessoaNome,pessoaIdade);
        p1.falando();


    }

}




