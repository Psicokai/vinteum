package com.example;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador) {
    
        if (jogador.parou()) {
            return null;
        }
        Carta aux = monte.virar();
        jogador.receberCarta(aux);
        System.out.println(aux.imagePath());
        return aux;

    }

    public boolean acabou() {
        if(jogador.getPontos()>21 || computador.getPontos()>21){
            return true;
        }else if(jogador.parou() && computador.parou()){
            return true;
        }
        return false;
    }

    public String resultado() {
        if(computador.parou() && jogador.parou()){
            if(getComputador().getPontos()==getJogador().getPontos()){
                return "Empate";
            }
            else if(getComputador().getPontos()<21&&getComputador().getPontos()>getJogador().getPontos()){
                return "Derrota";
            }else{
                return "Vitória";
            }
        }
        if(getComputador().getPontos()==getJogador().getPontos()){
            return "Empate";
        }else if(getComputador().getPontos()<getJogador().getPontos()){
            return "Derrota";
        }else{
            return "Vitória";
        }
    }

    public Computador getComputador() {
        return computador;
    }

    public Jogador getJogador() {
        return jogador;
    }

}
