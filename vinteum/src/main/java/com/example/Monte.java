package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte(){
    for(int i = 1; i <14;i++){
        cartas.add(new Carta(i, Naipe.Clubs));
        cartas.add(new Carta(i, Naipe.Hearts));
        cartas.add(new Carta(i, Naipe.Diamonds));
        cartas.add(new Carta(i, Naipe.Spades));
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta virar(){
        Carta aux = cartas.get(0);
        cartas.remove(0);
        return aux;
        
    }
}
