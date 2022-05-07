package com.br.javasouls;

public class Cenario extends Personagem {
    public int teste;

    public int combate;

    public String evento;

    public int getTeste() {
        return teste;
    }

    public void setTeste(int teste) {
        var inteligencia = getInteligencia();
        if (inteligencia>teste) System.out.println("Você Morreu");
        else System.out.println("Vitoria!");
    }

    public String iniciarCombate (Personagem personagem1, Personagem personagem2){
        String mensagem;
        if (personagem1.getForca()+personagem1.getDestreza()>=personagem2.getVigor()) mensagem = "Personagem 1 ganha";
        else mensagem = "Personagem 2 ganha";
        return mensagem;
    }

    //public int getCombate() {
   //     return combate;
    //}

    //public void setCombate(int combate) {
      //  var forca=getForca();
        //if (forca<combate)
          //      System.out.println("Se fodeu");
        //else System.out.println("Inimigo Derrotado");
    //}
    public String getEvento() {
        return evento;
    }

//    public void setEvento(String evento) {
       // if (evento=1)
         //   System.out.println("Desafio Conquistado!");
        //else System.out.println("Missão falhou");
    }



        //Cenario teste = new Cenario();
          //      teste.setTeste(1);


