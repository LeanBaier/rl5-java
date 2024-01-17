package com.rl5.ejercicios.empresa.empleado.impl;

import com.rl5.ejercicios.empresa.empleado.Empleado;

public class Administrativo extends Empleado {
    public Administrativo(String nombre, String apellido, Long legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public void trabajar() {
        System.out.println("Administrativo Trabajando.");
    }
}
