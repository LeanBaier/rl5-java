package com.rl5.ejercicios.empresa.departamento;

import com.rl5.ejercicios.empresa.empleado.Empleado;

import java.util.ArrayList;
import java.util.List;

public abstract class Departamento {

    private static Long idGenerator = 0L;
    private final String nombreDepartamento;
    private boolean tuvoEmpleados = false;
    private Long idDepartamento;

    private List<Empleado> empleados;

    public Departamento() {
        this.idDepartamento = ++idGenerator;
        this.empleados = new ArrayList<>();
        this.nombreDepartamento = this.getClass().getSimpleName() + " " + this.idDepartamento;
    }

    public boolean isTuvoEmpleados() {
        return tuvoEmpleados;
    }

    public boolean agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
        this.tuvoEmpleados = true;
        return true;
    }

    public void eliminarEmpleado(Empleado empleado) {
        this.empleados.remove(empleado);
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public List<Empleado> getEmpleados() {
        return this.empleados;
    }
    public Empleado buscarEmpleado(Long legajo) {
        for (var empleado : empleados) {
            if (empleado.getLegajo().equals(legajo)) {
                return empleado;
            }
        }
        return null;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
}
