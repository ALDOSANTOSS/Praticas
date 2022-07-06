package Pratica01;

import java.util.Scanner;

public class Pratica09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int velocidade = sc.nextInt();
        int rada = 60;
        if (rada > velocidade){
            System.out.println("Correto");
        }else {
            System.out.println("Errado");
        }
    }
}

