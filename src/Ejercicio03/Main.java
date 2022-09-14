package Ejercicio03;

import java.util.Scanner;

public class Main {
    /**
     * Programa que calcule la tabla de multiplicar de cualquier número entero
     * dado por el usuario.
     * Debe calcular la tabla desde el 0 hasta el 12.
     */

    // Funcion para imprimir un texto que tendra el resultado de una multiplicación
    public static String multiplicar(int numero, int n2) {
        return numero + " * " + n2 + " = " + (numero * n2);
    }

    public static void main(String[] args) {

        // Scanner lector permite pedir informacion al usuario
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese el número entero del que quiere la tabla de multiplicar: ");
        numero = scanner.nextInt();

        for ( int i = 0; i <= 12; i++) {
            System.out.println(multiplicar(numero, i));
        }




    }

}
