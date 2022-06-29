package AlgoritmoQuestoes;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextInt();
        double aumento = salario + (salario * 15 / 100);
        System.out.println("Resultado : " + aumento);
    }
}
