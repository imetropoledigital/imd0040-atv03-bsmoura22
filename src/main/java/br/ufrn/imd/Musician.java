package br.ufrn.imd;

public class Musician extends Person{

    public boolean playClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;


    Musician(String name, String hometown) {
        super(name, hometown);
    }

    public void play(){
    }

}
