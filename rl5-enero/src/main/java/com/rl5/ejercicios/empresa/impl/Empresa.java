package com.rl5.ejercicios.empresa.impl;

import com.rl5.ejercicios.empresa.departamento.Departamento;
import com.rl5.ejercicios.empresa.empleado.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    private final String nombre;
    private List<Departamento> departamentos;
    private List<Empleado> empleadosDisponibles;

    private Long legajoGenerator;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.empleadosDisponibles = new ArrayList<>();
        this.legajoGenerator = 0L;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void eliminarDepartamento(Departamento departamento) {
        this.departamentos.remove(departamento);
    }

    public void agregarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    public List<Empleado> getEmpleadosDisponibles() {
        return empleadosDisponibles;
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleadosDisponibles.add(empleado);
    }

    public Long getProximoLegajo() {
        return ++this.legajoGenerator;
    }

    public void asignarEmpleado(Long idDepartamento, Long legajo) {
        Departamento departamento = buscarDepartamento(idDepartamento);
        Empleado empleado = buscarEmpleado(legajo);
        if (Objects.nonNull(departamento) && Objects.nonNull(empleado)) {
            departamento.agregarEmpleado(empleado);
            this.empleadosDisponibles.remove(empleado);
        }
    }

    private Departamento buscarDepartamento(Long idDepartamento) {
        for (var departamento : departamentos) {
            if (departamento.getIdDepartamento().equals(idDepartamento)) {
                return departamento;
            }
        }
        return null;
    }

    private Empleado buscarEmpleado(Long legajo) {
        for (var empleado : empleadosDisponibles) {
            if (empleado.getLegajo().equals(legajo)) {
                return empleado;
            }
        }
        return null;
    }

}
