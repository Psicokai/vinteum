package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int i, Naipe naipe) {
        this.numero = i;
        this.naipe = naipe;
    }

    public String imagePath() {
            return "classic-cards/" + this.numero + this.naipe + ".png";
        
    
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

}
