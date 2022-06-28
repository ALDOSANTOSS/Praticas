package Pratica03Poo;

public class Carro {
    private String fabricante;
    private String modelo;
    private int ano;
    private boolean motoLigado;
    private int velocidade;

    Carro(){

    }

    public Carro(String fabricante, String modelo, int ano, boolean motoLigado, int velocidade) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.motoLigado = motoLigado;
        this.velocidade = velocidade;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean getMotoLigado() {
        return motoLigado;
    }

    public void setMotoLigado(boolean motoLigado) {
        this.motoLigado = motoLigado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    void detalhes(){

    }

}
