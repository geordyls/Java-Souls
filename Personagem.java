package com.br.javasouls;

public class Personagem extends Atributos{
    private String nome;
    private int forca;
    private int vigor;
    private int destreza;
    private int inteligencia;

    public String getAlinhamento() {
        return alinhamento;
    }

    //public void setAlinhamento(String alinhamento) {
      //  this.alinhamento = alinhamento;
    //}

    //public String alinhamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

        System.out.println("Bem vindo " + nome);

    }

    public int getForca() {
        return forca;

    }

    public void setForca(int forca) {
        this.forca = forca;
        System.out.println("Sua Força é " + forca);
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
        System.out.println("Seu Vigor é " + vigor);
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
        System.out.println("Sua Destreza é " + destreza);
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        System.out.println("Sua Inteligência é " + inteligencia);
    }
    //public static void main(String[] args) {
        //Personagem heroi = new Personagem();
        //heroi.setNome("John Darksoul");
        //heroi.setForca(3);
        //heroi.setVigor(3);
        //heroi.setDestreza(3);
        //heroi.setInteligencia(3);
        //heroi.setAlinhamento("bom");

    //}
}