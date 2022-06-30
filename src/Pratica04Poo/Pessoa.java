package Pratica04Poo;

public class Pessoa {

    String nome;
    String sexo;
    int idade;

    public Pessoa() {


    }

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    void correndo(){
        System.out.println("Andado");
    }
}
