package AlgoritmoQuestoes;

 /*Desenvolver um programa que pergunte ao usuário o seu nome completo e seu sexo. Em seguida, o programa
        deve apresentar os dados anteriormente informados */

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome ? ");
        String nome = sc.next();
        System.out.println("Qual seu sexo ? ");
        String sexo = sc.next();
        System.out.println("Nome: " + nome + " Sexo:" + sexo);
    }
}



