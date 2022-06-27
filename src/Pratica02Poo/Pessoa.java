package Pratica02Poo;

public class Pessoa {

    String nome;
    int idade;

    Pessoa(){

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void mostra(String nome, int idade){
        System.out.println("Nome :" + nome);
        System.out.println("idade :" + idade);

    }

    void falando(){
        System.out.println("Estou falando");
    }
}


