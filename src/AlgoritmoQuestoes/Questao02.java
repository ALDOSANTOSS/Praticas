package AlgoritmoQuestoes;

/*  Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
a)Resultado de suas adições
b)Resultado de suas multiplicações*/

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4, resuladoAdicao, resultadoMultiplicacao;

        System.out.println("Informe primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Informe Segundo numero");
        num2 = sc.nextInt();
        System.out.println("Informe Terceiro numero");
        num3 = sc.nextInt();
        System.out.println("Informe Quarto numero");
        num4 = sc.nextInt();
        resuladoAdicao = num1 + num2 + num3 + num4;
        resultadoMultiplicacao = num1 * num2 * num3 * num4;
        System.out.println("Resultado Adicao :" + resuladoAdicao);
        System.out.println("Resulado Multiplicacao :" +resultadoMultiplicacao);


    }
}
