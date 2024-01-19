package com.rl5.ejercicios.empresa.impl;

import com.rl5.ejercicios.empresa.departamento.Departamento;
import com.rl5.ejercicios.empresa.departamento.impl.Gerencia;
import com.rl5.ejercicios.empresa.departamento.impl.Planta;
import com.rl5.ejercicios.empresa.departamento.impl.RRHH;
import com.rl5.ejercicios.empresa.empleado.Empleado;
import com.rl5.ejercicios.empresa.empleado.impl.Administrativo;
import com.rl5.ejercicios.empresa.empleado.impl.Gerente;
import com.rl5.ejercicios.empresa.empleado.impl.Operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    private final String nombre;
    private List<Departamento> departamentos;
    private List<Empleado> empleadosDisponibles;
    private boolean tuvoDepartamentos = false;

    private Long legajoGenerator;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.empleadosDisponibles = new ArrayList<>();
        this.legajoGenerator = 0L;

      /*  this.agregarDepartamento(new Gerencia());
        this.agregarDepartamento(new RRHH());
        this.agregarDepartamento(new RRHH());

        for (int i = 1; i <= 4; i++) {
            this.departamentos.add(new Planta());
        }
        for (int i = 1; i <= 10; i++) {
            this.empleadosDisponibles.add(new Operador("Operador", String.valueOf(i), getProximoLegajo()));
        }
        for (int i = 1; i <= 4; i++) {
            this.empleadosDisponibles.add(new Administrativo("Administrativo", String.valueOf(i), getProximoLegajo()));
        }
        for (int i = 1; i <= 2; i++) {
            this.empleadosDisponibles.add(new Gerente("Gerente", String.valueOf(i), getProximoLegajo()));
        }*/


    }

    public String getNombre() {
        return nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void eliminarDepartamento(Long idDepartamento) {
        Departamento departamentoAEliminar = null;
        for (var departamento : this.departamentos) {
            if (departamento.getIdDepartamento().equals(idDepartamento)) {
                departamentoAEliminar = departamento;
            }
        }
        if (Objects.nonNull(departamentoAEliminar)) {
            this.departamentos.remove(departamentoAEliminar);
        }
    }

    public void agregarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
        this.tuvoDepartamentos = true;
    }

    public boolean isTuvoDepartamentos() {
        return tuvoDepartamentos;
    }

    public List<Empleado> getEmpleadosDisponibles() {
        return empleadosDisponibles;
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleadosDisponibles.add(empleado);
    }

    public void bajaEmpleado(Long legajo) {
        Empleado empleadoBaja = null;
        for (var empleado : this.empleadosDisponibles) {
            if (empleado.getLegajo().equals(legajo)) {
                empleadoBaja = empleado;
            }
        }
        if (Objects.nonNull(empleadoBaja)) {
            this.empleadosDisponibles.remove(empleadoBaja);
        }
    }

    public Long getProximoLegajo() {
        return ++this.legajoGenerator;
    }

    public void asignarEmpleado(Long idDepartamento, Long legajo) {
        Departamento departamento = buscarDepartamento(idDepartamento);
        Empleado empleado = buscarEmpleado(legajo);
        if (Objects.nonNull(departamento) && Objects.nonNull(empleado)) {
            boolean agregado = departamento.agregarEmpleado(empleado);
            if (agregado) {
                this.empleadosDisponibles.remove(empleado);
            }
        }
    }

    public void bajaEmpleadoDepartamento(Long idDepartamento, Long legajo) {
        Departamento departamento = buscarDepartamento(idDepartamento);

        if (Objects.nonNull(departamento)) {
            Empleado empleado = departamento.buscarEmpleado(legajo);
            if (Objects.nonNull(empleado)) {
                departamento.eliminarEmpleado(empleado);
                this.empleadosDisponibles.add(empleado);
            }
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

    public List<Empleado> getEmpleadosDeDepartamento(Long idDepartamento) {
        for (var departamento : this.departamentos) {
            if (departamento.getIdDepartamento().equals(idDepartamento)) {
                return departamento.getEmpleados();
            }
        }
        return null;
    }

    public void validarDepartamentosActivos() {
        var departamentosAEliminar = new ArrayList<>();
        for (var departamento : this.departamentos){
            if (departamento.isTuvoEmpleados() && departamento.getEmpleados().isEmpty()){
                departamentosAEliminar.add(departamento);
            }
        }
        for (var departamento : departamentosAEliminar){
            this.departamentos.remove(departamento);
        }
    }
}
