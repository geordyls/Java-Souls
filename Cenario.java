package com.br.javasouls;

public class Cenario extends Personagem {
    public int teste;
    public int combate;
    public String evento;

    public int getTeste() {
        return teste;
    }

    public void setTeste(int teste) {
        if (inteligencia>teste)
            System.out.println("Você Morreu");
        else System.out.println("Vitoria!");
    }

    public int getCombate() {
        return combate;
    }

    public void setCombate(int combate) {
        if (forca<combate)
                System.out.println("Se fodeu");
        else System.out.println("Inimigo Derrotado");
    }
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        if (evento=String)
            System.out.println("Desafio Conquistado!");
        else System.out.println("Missão falhou");
    }

    public static void main(String[] args) {
        Cenario combate = new Cenario();
        combate.setCombate(4);
        Cenario teste = new Cenario();
                teste.setTeste(1);



    }
}
