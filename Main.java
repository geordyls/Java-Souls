package com.br.javasouls;

public class Main{
    public static void main(String[] args) {
        System.out.println("JAVA SOULS" + System.lineSeparator() + "Aperte start");

        Personagem heroi = new Personagem();
        heroi.setNome("John Darksoul");
        heroi.setForca(3);
        heroi.setVigor(3);
        heroi.setDestreza(3);
        heroi.setInteligencia(3);

        Personagem inimigo = new Personagem();
        inimigo.setNome("John Rambo");
        inimigo.setForca(5);
        inimigo.setVigor(1);
        inimigo.setDestreza(1);
        inimigo.setInteligencia(1);

        Cenario cenario1 = new Cenario();
        cenario1.iniciarCombate(heroi,inimigo);
        String resultado = cenario1.iniciarCombate(heroi,inimigo);
        System.out.println(resultado);

    }
}