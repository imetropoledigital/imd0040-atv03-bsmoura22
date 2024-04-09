package br.ufrn.imd;

public class GuitarPlayer extends Musician {

    public boolean howManyYears;
    public boolean playEletronicGuitar;
    public boolean playAcousticGuitar;


    GuitarPlayer(String name, String hometown, boolean howManyYears, boolean playEletronicGuitar, boolean playAcousticGuitar) {
        super(name, hometown);
        this.howManyYears = howManyYears;
        this.playEletronicGuitar = playEletronicGuitar;
        this.playAcousticGuitar = playAcousticGuitar;
    }
    
    public void playGuitar() {
    }
}
