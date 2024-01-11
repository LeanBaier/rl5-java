package com.rl5.poo;

import java.util.Date;
import java.util.Objects;

public class Persona extends SerVivo {

    private Date fechaNacimiento;
    private String apellido;

    public Persona() {
        this.fechaNacimiento = new Date();
    }


    public void setApellido(String apellido){
        if (Objects.isNull(apellido) || apellido.isBlank()){
            return;
        }
        this.apellido = apellido;
    }

    public String getNombreApellido() {
        return this.getNombre() + " " + this.apellido;
    }

    public void caminar(){

    }

    public void hablar(){

    }

    @Override
    public void comer() {
        System.out.println("La persona esta comiendo.");
    }
}
