package com.rl5.ejercicios.empresa.empleado;

public abstract class Empleado {

    private final String nombre;
    private final String apellido;
    private final Long legajo;

    public Empleado(String nombre, String apellido, Long legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getLegajo() {
        return legajo;
    }

    public abstract void trabajar();

}
