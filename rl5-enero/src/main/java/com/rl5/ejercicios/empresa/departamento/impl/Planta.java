package com.rl5.ejercicios.empresa.departamento.impl;

import com.rl5.ejercicios.empresa.departamento.Departamento;
import com.rl5.ejercicios.empresa.empleado.Empleado;
import com.rl5.ejercicios.empresa.empleado.impl.Operador;

public class Planta extends Departamento {

    public Planta(){
        super();
    }

    @Override
    public boolean agregarEmpleado(Empleado empleado) {
        if (empleado instanceof Operador){
            return super.agregarEmpleado(empleado);
        }else {
            System.out.println("El empleado de tipo [" + empleado.getClass().getSimpleName() + "] no se puede asignar a la planta.");
            return false;
        }
    }

}
