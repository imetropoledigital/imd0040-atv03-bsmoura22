package br.ufrn.imd;

public class Musician extends Person{

    public boolean playClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;


    Musician(String name, String hometown, boolean playClassicalMusic, boolean canImprovise, boolean canCompose) {
        super(name, hometown);
        this.playClassicalMusic = playClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
           }

    public void play(){
    }

}
