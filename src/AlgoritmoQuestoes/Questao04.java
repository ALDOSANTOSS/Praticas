package AlgoritmoQuestoes;


/* Fazer
um programa que pergunte um número inteiro e apresente o seu antecessor e seu sucessor.*/

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, ant, suc;
        num = sc.nextInt();
        ant = num - 1;
        suc = num + 1;
        System.out.println("O antecessor : " + ant + " O Sucessor : " + suc);



    }
}
