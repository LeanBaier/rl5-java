package com.rl5;

public class Main {
    public static void main(String[] args) {

        // int number = 0;
        // char caracter = 'C';
        // double doble = 1.2D;
        // float flotante = 1.1f;
        // long bigNumber = 1L;
        // boolean booleano = true;

        int[] vectorNumeros = new int[3];
        vectorNumeros[0] = 1;
        vectorNumeros[1] = 2;
        vectorNumeros[2] = 3;
        // vectorNumeros[3] = 1;
        // vectorNumeros[-1] = 1;
        System.out.println(vectorNumeros[0]);

        int number = 5;

        if (number >= 3) {
            System.out.println("El numero es mayor o igual a 3");
        }

        switch (number) {
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            default:
                System.out.println("El numero es menor a 1 o mayor a 2");
        }

        switch (number) {
            case 1 -> {
                System.out.println("El numero es 1");
            }
            case 2 -> System.out.println("El numero es 2");
            default -> System.out.println("El numero es menor a 1 o mayor a 2");
        }

        for (int i = 0; i < 3; i++){
            System.out.println(vectorNumeros[i]);
        }

        int index = 0;
        while(index < 3){
            System.out.println(vectorNumeros[index]);
            index = index + 1;
        }

        index = 5;
        do {
            if (index < 3){
                System.out.println(vectorNumeros[index]);
            }
            index = index + 1;
        }while(index < 3);

        for (int i : vectorNumeros) {
            System.out.println(i);
        }

        for (int i : vectorNumeros) {
            mostrarNumero(i);
        }
    }

    static void mostrarNumero(int numero){
        System.out.println(numero);
    }
}