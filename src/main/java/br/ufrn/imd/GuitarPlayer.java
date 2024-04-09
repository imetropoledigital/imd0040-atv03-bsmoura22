package br.ufrn.imd;

public class GuitarPlayer extends Musician {

    public boolean howManyYears;
    public boolean playEletronicGuitar;
    public boolean playAcousticGuitar;


    GuitarPlayer(String name, String hometown, boolean playClassicalMusic, boolean canImprovise, boolean canCompose, boolean howManyYears, boolean playEletronicGuitar, boolean playAcousticGuitar) {
        super(name, hometown, playClassicalMusic, canImprovise, canCompose);
        this.howManyYears = howManyYears;
        this.playEletronicGuitar = playEletronicGuitar;
        this.playAcousticGuitar = playAcousticGuitar;
    }
    
    public void playGuitar() {
    }
}
