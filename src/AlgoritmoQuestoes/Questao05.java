package AlgoritmoQuestoes;


/* Fazer um programa que pergunte o salário de um funcionário e apresente este salário com um aumento de 15%.*/


import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double aumento = salario + (salario * 15 / 100);
        System.out.println("Resultado: " + aumento);


    }
}
