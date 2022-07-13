package Pratica01;

import java.util.Scanner;

public class Pratica13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        switch (valor){
            case 1:
                System.out.println("Valor 1");
                break;
            case 2:
                System.out.println("Valor 2");
                break;
            case 3:
                System.out.println("Valor 3");
                break;
            default:
                System.out.println("Valor invalido");
        }
    }

}

