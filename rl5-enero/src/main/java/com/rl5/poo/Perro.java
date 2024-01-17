package com.rl5.poo;

public class Perro extends Animal {

    private final String raza;

    public Perro(String raza){
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public void comer() {
        System.out.println("El perro esta comiendo");
    }

    @Override
    public void alimentar() {
        System.out.println("El perro se esta alimentando");
    }
}
