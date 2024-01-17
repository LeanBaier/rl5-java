package com.rl5.ejercicios.empresa.departamento.impl;

import com.rl5.ejercicios.empresa.departamento.Departamento;
import com.rl5.ejercicios.empresa.empleado.Empleado;
import com.rl5.ejercicios.empresa.empleado.impl.Operador;

public class Planta extends Departamento {

    public Planta(){
        super();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        if (empleado instanceof Operador){
            super.agregarEmpleado(empleado);
        }
    }

}
