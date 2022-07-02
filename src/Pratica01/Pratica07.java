package Pratica01;

import java.util.Scanner;

public class Pratica07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidade = sc.nextInt();
        int media = 50;
        if (media < velocidade){
            System.out.println("Mutado");
        }
    }
}
