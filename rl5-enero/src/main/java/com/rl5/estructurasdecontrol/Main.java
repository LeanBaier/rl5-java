package com.rl5.estructurasdecontrol;

public class Main {

    public static void main(String[] args) {
        //Estructuras de control - IF / Switch

        /*Operadores
            ! -> Negación
            boolean b = !false; //true
            ++ -> Incremento
            int a = 1;
            a++; //a vale 2
            ++a; //a vale 3
            -- -> Decremento
            a--; //a vale 2
            --a; //a vale 1

            + -> Suma
            int resultado = 2 + 5; //resutado vale 7
            - -> Resta
            int resultado = 2 - 5; //resultado vale -3
            * -> Multiplicación
            int resultado = 2 * 5; //resultado vale 10
            / -> Divición
            int resultado = 10 / 5; //resultado vale 2
            % -> Resto
            int resultado = 11 / 5; //resultado vale 1

            true -> Verdadero
            false -> Falso

            = -> Asignar valor
            += -> Acumular
            int acumulador = 1;
            acumulador += 3; //acumulador vale 4
            -= -> Decrementar
            acumulador -= 1; //acumulador vale 3

            Comparadores
            == -> Igual a
            1 == 1 // true
            1 == 2 // false

            != -> Distinto a
            1 != 1 //false
            1 != 2 //true

            < -> Menor
            1 < 1 //false
            1 < 2 //true

            <= -> Menor o igual
            1 <= 1 //true
            1 <= 0 //false
            1 <= 2 //true

            > -> Mayor
            1 > 1 //false
            2 > 1 //true

            >= -> Mayor o igual
            1 >= 1 //true
            1 >= 2 //false
            1 >= 0 //true

            && -> Y / And
            true && true -> true
            true && false -> false
            false && false -> false
            false && true -> false

            || -> O / Or
            true || true -> true
            true || false -> true
            false || false -> false
            false || true -> true
        */

        //IF



        /*
            == -> Igual a
            != -> Distinto a
            < -> Menor
            <= -> Menor o igual
            > -> Mayor
            >= -> Mayor o igual
         */


        //IF - IF ELSE
        /*int numero = 10;
        if (numero <= 5 ){
            System.out.println("El numero es menor o igual a 5");
        } else if (numero < 10){
            System.out.println("Es mayor a 5 y menor a 10");
        } else {
            System.out.println("Es mayor o igual 10");
        }*/


        //Switch
        /*
            Opciones:
            1 - abrir archivo
            2 - borrar archivo
            3 - salir
         */
        int opcion = 2;
        switch (opcion){
            case 1:
                System.out.println("Abriendo archivo.");
                break;
            case 2:
                System.out.println("Borrando archivo.");
                break;
            case 3:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Esta opcion no existe");
        }
    }

}
