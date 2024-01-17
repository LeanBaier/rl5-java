package com.rl5.poo;

public abstract class SerVivo implements Alimentable{

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println("El Ser Vivo esta comiendo.");
    }

}
