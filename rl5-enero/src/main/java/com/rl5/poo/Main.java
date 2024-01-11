package com.rl5.poo;

import java.util.Date;

public class Main {

    /*
        Encapsulamiento
        Herencia
        Polimorfismo
        Abstracción
     */
    public static void main(String[] args) {
        /*Persona miPersona = new Persona();
        miPersona.setNombre("");
        miPersona.setNombre("    ");
        miPersona.setNombre("Leandro");

        miPersona.setApellido("Baier");

        System.out.println(miPersona.getNombreApellido());

        miPersona.comer();

        Animal animal = new Animal();
        animal.setNombre("Perro");
        animal.comer();*/

        SerVivo serV = new Animal();

        serV.comer();

        serV = new Persona();

        serV.comer();


    }
}
