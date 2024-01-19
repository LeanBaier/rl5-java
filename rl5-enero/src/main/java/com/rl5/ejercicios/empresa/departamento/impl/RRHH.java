package com.rl5.ejercicios.empresa.departamento.impl;

import com.rl5.ejercicios.empresa.departamento.Departamento;
import com.rl5.ejercicios.empresa.empleado.Empleado;
import com.rl5.ejercicios.empresa.empleado.impl.Administrativo;

public class RRHH extends Departamento {

    @Override
    public boolean agregarEmpleado(Empleado empleado) {
        if (empleado instanceof Administrativo) {
            return super.agregarEmpleado(empleado);
        } else {
            System.out.println("El empleado de tipo [" + empleado.getClass().getSimpleName() + "] no se puede asignar a la RRHH.");
            return false;
        }
    }
}
