package com.rl5.ejercicios.empresa.departamento.impl;

import com.rl5.ejercicios.empresa.departamento.Departamento;
import com.rl5.ejercicios.empresa.empleado.Empleado;
import com.rl5.ejercicios.empresa.empleado.impl.Gerente;

public class Gerencia extends Departamento {

    @Override
    public boolean agregarEmpleado(Empleado empleado) {
        if (empleado instanceof Gerente) {
            return super.agregarEmpleado(empleado);
        } else {
            System.out.println("El empleado de tipo [" + empleado.getClass().getSimpleName() + "] no se puede asignar a la gerencia.");
            return false;
        }
    }
}
