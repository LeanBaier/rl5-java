package com.rl5.ejercicios.empresa.departamento;

import com.rl5.ejercicios.empresa.empleado.Empleado;

import java.util.ArrayList;
import java.util.List;

public abstract class Departamento {

    private static Long idGenerator = 0L;

    private Long idDepartamento;

    private List<Empleado> empleados;

    public Departamento() {
        this.idDepartamento = ++idGenerator;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        this.empleados.remove(empleado);
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }
}
