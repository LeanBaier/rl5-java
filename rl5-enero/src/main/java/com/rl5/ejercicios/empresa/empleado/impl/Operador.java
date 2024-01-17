package com.rl5.ejercicios.empresa.empleado.impl;

import com.rl5.ejercicios.empresa.empleado.Empleado;

public class Operador extends Empleado {
    public Operador(String nombre, String apellido, Long legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public void trabajar() {
        System.out.println("Operador Trabajando");
    }
}
