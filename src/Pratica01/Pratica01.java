package Pratica01;

import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int valor01 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        int valor02 = sc.nextInt();
        int valor03 = valor01 + valor02;
        System.out.println("Resultado " + valor03);
        

    }
}
