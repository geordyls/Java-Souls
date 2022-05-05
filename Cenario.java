package com.br.javasouls;


public class Cenario extends Personagem {
    public int teste;
    public String combate;

    public String evento;

    public int getTeste() {
        return teste;
    }

    public void setTeste(int teste) {
        if (forca<teste)
            System.out.println("Você Morreu");
        else System.out.println("Vitoria!");
    }

    public String getCombate() {
        return combate;
    }

    public void setCombate(String combate) {
        this.combate = combate;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }


    public static void main(String[] args) {

    }
}
