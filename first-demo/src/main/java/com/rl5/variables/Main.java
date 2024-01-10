package com.rl5.variables;

public class Main {

    public static void main(String[] args) {
        //¿Que es una variable?
        // numero = 5;
        // nombre = Leandro;
        // nombre = Daniel;

        // int number = 0;
        // char caracter = 'C';
        // double doble = 1.2D;
        // float flotante = 1.1f;
        // long bigNumber = 1L;
        // boolean booleano = true;

        int numero = 600;
        long numero_largo = 500L;
        float conComa = 50.5f;
        double doble = 50.0D;
        char caracter = 'D';
        boolean booleano = false; // true

        //Muestra en consola la variable
        System.out.println(numero);
        System.out.println(conComa);
        System.out.println(caracter);

        //Tipo de dato - nombre
        int variable_sin_valor;
        variable_sin_valor = 500;

        //Vector o Array
        int[] numeros = new int[5];
        // [1] [2] [3] [4] [5]
        //  0   1   2   3   4

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        System.out.println(numeros[1]);
    }

}
