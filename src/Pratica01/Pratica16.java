package Pratica01;

import java.util.Scanner;

public class Pratica16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        switch (idade){
            case 1:
                System.out.println("Idade 1");
                break;
            case 2:
                System.out.println("Idade 2");
                break;
            case 3:
                System.out.println("Idade 3");
                break;
            default:
                System.out.println("Idade invalida");
        }
    }
}
