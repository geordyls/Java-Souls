package com.br.javasouls;

public class Main extends Personagem {

    public String start;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
        System.out.println("JAVA SOULS" +System.lineSeparator()+start);
    }
    public static void main(String[] args) {
        Main start = new Main();
        start.setStart("Aperte Start");

    }
}