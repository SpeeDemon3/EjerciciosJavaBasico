package Ejercicio07;

import java.util.Scanner;

public class Main {

    /**
     * Programa que pida 2 números al usuario y una operación aritmética a ejecutar con esos 2 números.
     * Las operaciones son:
     * - Suma
     * - Resta ( al primero menos el segundo)
     * - Multiplicación
     * - División (al primero sobre el segundo)
     * - Exponenciación (el primero es la base y el segundo el exponente)
     * - Radicación (el primero es el radicando y el segundo es el índice)
     */

    public static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }


    public static double division(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static double exponienciacion(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }


    public static double radicacion(double numero1, double numero2) {
        return Math.pow(numero1, (1/numero2));
    }

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        double numero1, numero2;
        int opcion;

        System.out.println("Bienvenido al juego de aritmetica, debera insertar 2 números para la operación.");
        System.out.println("Introduzca el primer número: ");
        numero1 = usuario.nextInt();
        System.out.println("Introduzca el segundo número: ");
        numero2 = usuario.nextInt();

        System.out.println("\n1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Exponienciacion");
        System.out.println("6. Radicacion");
        System.out.println("Ind1" +
                "ique la operacion desea ejecutar: ");
        opcion = usuario.nextInt();

        if (opcion == 1) {

        } else if (opcion == 2) {
            System.out.println("La suma es:" + suma(numero1, numero2));
        } else if (opcion == 3) {
            System.out.println("La resta es:" + resta(numero1, numero2));
        } else if (opcion == 4) {
            System.out.println("La multiplicacion es:" + multiplicacion(numero1, numero2));
        } else if (opcion == 5) {
            System.out.println("La division es:" + division(numero1, numero2));
        } else if (opcion == 6) {
            System.out.println("La exponienciacion es:" + exponienciacion(numero1, numero2));
        } else if (opcion == 7) {
        System.out.println("La radicacion es:" + radicacion(numero1, numero2));
        } else {
            System.out.println("ERROR: Debe ingresar un opcion valida.");
        }
    }

}
