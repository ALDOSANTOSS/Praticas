package Pratica01;

import java.util.Scanner;

public class Pratica04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valocidade = sc.nextInt();
        int limite = 50;
        if (valocidade > limite){
            System.out.println("Mutado");
        } else {
            System.out.println("Correto");
        }

    }
}
