package Pratica01;

import java.util.Scanner;

public class Pratica14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Dia 1");
                break;
            case 2:
                System.out.println("Dia 2");
                break;
            case 3:
                System.out.println("Dia 3");
                break;
            case 4:
                System.out.println("Dia 4");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}

