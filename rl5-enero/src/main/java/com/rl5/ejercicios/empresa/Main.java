package com.rl5.ejercicios.empresa;

import com.rl5.ejercicios.empresa.departamento.Departamento;
import com.rl5.ejercicios.empresa.departamento.impl.Alimentos;
import com.rl5.ejercicios.empresa.departamento.impl.Gerencia;
import com.rl5.ejercicios.empresa.departamento.impl.Planta;
import com.rl5.ejercicios.empresa.departamento.impl.RRHH;
import com.rl5.ejercicios.empresa.empleado.Empleado;
import com.rl5.ejercicios.empresa.empleado.impl.Administrativo;
import com.rl5.ejercicios.empresa.empleado.impl.Gerente;
import com.rl5.ejercicios.empresa.empleado.impl.Operador;
import com.rl5.ejercicios.empresa.impl.Empresa;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*

        Sistema de gestion de empresas
        El sistema debe permitir:
         1. Administrar departamentos de la empresa
         2. Administrar los empleados disponibles y los que pertenecen a cada departamento

         Consideraciones:
         a. Los nuevos departamentos no poseen empleados
         b. Los departamentos que se quedan sin empleados se deben eliminar
         c. Los empleados que se incorporen al departamento deben ser del tipo correcto
         d. Los empleados que se quiten del departamento deben volver a la lista de empleados disponibles
         e. Si la empresa se queda sin departamentos se cierra

         Administrar = Listar, agregar, quitar, eliminar

         */

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre de la empresa: ");

            String nombreEmpresa = scanner.next();
            Empresa empresa = new Empresa(nombreEmpresa);

            Boolean continuar = true;
            do {
                if (empresa.isTuvoDepartamentos() && empresa.getDepartamentos().isEmpty()){
                    System.out.println("Empresa cerrada.");
                    System.exit(0);
                }

                System.out.println("Sistema de gestion de empresas (" + nombreEmpresa + "): ");
                System.out.println("1. Departamentos");
                System.out.println("2. Empleados");
                System.out.println("3. Administrar empleados asignados");
                System.out.println("0. Salir");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println();
                        System.out.println("---------");
                        System.out.println();
                        System.out.println("Gestion de departamentos:");
                        System.out.println("1. Agregar departamento");
                        System.out.println("2. Eliminar departamento");
                        System.out.println("3. Ver departamentos disponibles");
                        System.out.println("0. Cancelar");
                        int opcionDepartamentos = scanner.nextInt();

                        switch (opcionDepartamentos) {
                            case 1 -> {
                                Departamento departamento = obtenerDepartamento(scanner);
                                if (Objects.nonNull(departamento)) {
                                    empresa.agregarDepartamento(departamento);
                                }
                            }
                            case 2 -> {
                                listarDepartamentos(empresa.getDepartamentos());
                                System.out.print("Ingrese el ID de departamento a eliminar: ");
                                long id = scanner.nextLong();
                                empresa.eliminarDepartamento(id);
                            }
                            case 3 -> {
                                listarDepartamentos(empresa.getDepartamentos());
                                System.out.println("Ingrese una tecla y enter para continuar.");
                                scanner.next();
                            }

                            case 0 -> {
                            }
                            default -> {
                                System.out.println("Opción no encontrada");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println();
                        System.out.println("---------");
                        System.out.println();
                        System.out.println("Gestion de empleados disponibles:");
                        System.out.println("1. Agregar empleado");
                        System.out.println("2. Baja a empleado");
                        System.out.println("3. Listar empleados");
                        System.out.println("0. Cancelar");
                        int opcionEmpleados = scanner.nextInt();

                        switch (opcionEmpleados) {
                            case 1 -> {
                                Empleado nuevoEmpleado = obtenerEmpleado(scanner, empresa.getProximoLegajo());
                                if (Objects.nonNull(nuevoEmpleado)) {
                                    empresa.agregarEmpleado(nuevoEmpleado);
                                }
                            }
                            case 2 -> {
                                listarDepartamentos(empresa.getDepartamentos());
                                System.out.print("Ingrese el legajo del empleado: ");
                                long id = scanner.nextLong();
                                empresa.bajaEmpleado(id);
                            }
                            case 3 -> {
                                listarEmpleados(empresa.getEmpleadosDisponibles());
                                System.out.println("Ingrese una tecla y enter para continuar.");
                                scanner.next();
                            }
                            case 0 -> {

                            }
                            default -> {
                                System.out.println("Opción no encontrada");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println();
                        System.out.println("---------");
                        System.out.println();

                        if (empresa.getDepartamentos().isEmpty()) {
                            System.out.println("No dispone de departamentos.");
                            System.out.println();
                            System.out.println("---------");
                            System.out.println();
                            break;
                        }
                        if (empresa.getEmpleadosDisponibles().isEmpty()) {
                            System.out.println("No hay empleados disponibles");
                            System.out.println();
                            System.out.println("---------");
                            System.out.println();
                            break;
                        }
                        System.out.println("Administrar empleados asignados");
                        System.out.println("Seleccione el departamento:");
                        listarDepartamentos(empresa.getDepartamentos());
                        long idDepartamento = scanner.nextLong();
                        boolean continuarAdministrando = true;
                        do {
                            System.out.println();
                            System.out.println("---------");
                            System.out.println();
                            System.out.println("1. Agregar empleado");
                            System.out.println("2. Baja a empleado");
                            System.out.println("3. Listar empleados");
                            System.out.println("0. Salir");
                            int opcionAdministrar = scanner.nextInt();
                            switch (opcionAdministrar){
                                case 1 -> {
                                    listarEmpleados(empresa.getEmpleadosDisponibles());
                                    System.out.print("Seleccione el legajo del empleado: ");
                                    long legajo = scanner.nextLong();
                                    empresa.asignarEmpleado(idDepartamento, legajo);
                                }
                                case 2 -> {
                                    listarEmpleados(empresa.getEmpleadosDeDepartamento(idDepartamento));
                                    System.out.print("Seleccione el legajo del empleado: ");
                                    long legajo = scanner.nextLong();
                                    empresa.bajaEmpleadoDepartamento(idDepartamento, legajo);
                                }
                                case 3 -> {
                                    listarEmpleados(empresa.getEmpleadosDeDepartamento(idDepartamento));
                                    System.out.println("Ingrese una tecla y enter para continuar.");
                                    scanner.next();
                                }
                                case 0 ->
                                    continuarAdministrando = false;

                                default ->
                                    System.out.println("Opción no encontrada");

                            }
                        }while (continuarAdministrando);
                        empresa.validarDepartamentosActivos();
                    }
                    case 0 -> {
                        continuar = false;
                    }
                    default -> {
                        System.out.println("Opción no encontrada");
                    }
                }

            } while (continuar);

            System.out.println("Gracias por usar nuestra aplicación.");
        }
    }

    private static void listarEmpleados(List<Empleado> empleadosDisponibles) {
        for (var empleado : empleadosDisponibles) {
            System.out.println(empleado.getLegajo() +
                    ". " +
                    empleado.getNombre() + " " + empleado.getApellido() + " - Tipo: " + empleado.getClass().getSimpleName());
        }
    }

    private static Empleado obtenerEmpleado(Scanner scanner, Long legajo) {
        System.out.println("Tipo de empleado: ");
        System.out.println("1. Operador");
        System.out.println("2. Administrativo");
        System.out.println("3. Gerente");
        System.out.println("0. Cancelar");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese nombre del operador: ");
        String nombre = scanner.next();
        System.out.print("Ingrese apellido del operador: ");
        String apellido = scanner.next();
        switch (opcion) {
            case 1 -> {
                return new Operador(nombre, apellido, legajo);
            }
            case 2 -> {
                return new Administrativo(nombre, apellido, legajo);
            }
            case 3 -> {
                return new Gerente(nombre, apellido, legajo);
            }
            case 0 -> {
                System.out.println("Cancelado");
            }
            default -> {
                System.out.println("No se encontro la opcion");
            }
        }
        return null;

    }

    public static Departamento obtenerDepartamento(Scanner scanner) {
        System.out.println("Tipo de departamento: ");
        System.out.println("1. Planta");
        System.out.println("2. RRHH");
        System.out.println("3. Gerencia");
        System.out.println("4. Alimentos");
        System.out.println("0. Cancelar");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1 -> {
                return new Planta();
            }
            case 2 -> {
                return new RRHH();
            }
            case 3 -> {
                return new Gerencia();
            }
            case 4 -> {
                return new Alimentos();
            }
            case 0 -> {
                System.out.println("Cancelado");
            }
            default -> {
                System.out.println("No se encontro la opcion");
            }
        }
        return null;
    }

    public static void listarDepartamentos(List<Departamento> departamentoList) {
        for (var departamento : departamentoList) {
            System.out.println(departamento.getIdDepartamento() +
                    ". " +
                    departamento.getNombreDepartamento());
        }
    }

}
