package br.ufrn.imd;

public class Person {

    Person(String name, String hometown){
        this.name = name;
        this.hometown = hometown;

    }
    public String name;
    public String hometown;

    public String name(){
        return name;
    }
    public String hometown(){
        return hometown;
    }
}
