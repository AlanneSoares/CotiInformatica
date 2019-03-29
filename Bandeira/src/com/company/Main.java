package com.company;

import com.company.bandeira.Bandeira;

public class Main {

    public static void main(String[] args) {

        Bandeira bandeira = new Bandeira();
        bandeira.setBrasil("Verde, Amarelo, Azul e Branco");
        bandeira.setMéxico("Amarelo, Vermelho e Verde");
        bandeira.setArgentina("Azul, Amarelo e Branco");
        bandeira.setEquador("Amarelo, Azul e Vermelho");
        bandeira.setChile("Azul, Branco e Vermelho");

        System.out.println("------------------------------------\n" +
                           "        CORES DA BANDEIRA\n"           +
                           "------------------------------------" +
                            "\nBrasil: " + bandeira.getBrasil() +
                            "\nMéxico: " + bandeira.getMéxico() +
                            "\nArgentina: " + bandeira.getArgentina() +
                            "\nEquador: " + bandeira.getEquador() +
                            "\nChile: " + bandeira.getChile()

        );
    }
}