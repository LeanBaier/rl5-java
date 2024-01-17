package com.rl5.poo;

public class Animal extends SerVivo{

    @Override
    public void comer() {
        super.getNombre();
        System.out.println("El animal esta comiendo.");
    }

    @Override
    public void alimentar() {
        System.out.println("El animal se esta alimentando.");
    }
}
