package AlgoritmoQuestoes;

/*Fazer um programa que pergunte um valor em Dólares e apresente o equivalente em Reais. Considere U$1,00 =
R$
3,80 */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("informe o valor em real");
        int real = sc.nextInt();
        double dolar = real * 3.80;
        System.out.println("Resultado : " + dolar);
    }
}
