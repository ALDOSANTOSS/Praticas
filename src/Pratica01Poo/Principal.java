package Pratica01Poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MandaMensagem oi = new MandaMensagem();
        System.out.println("Entre com seu nome");
        String nomeAluno;
        int idadeAluno;
        nomeAluno = sc.next();
        System.out.println("Entre com seu idade");
        idadeAluno = sc.nextInt();
        oi.mandaBoasVindas(nomeAluno, idadeAluno);
        sc.close();

    }
}
