package Ejercicio01;

import java.util.Scanner;

public class Main {
    /**
     * Programa que toma las tres notas de un estudiante y diga la nota final del curso.
     * Tenga en cuenta que la primera y segunda nota valen el 30% de la nota final.
     * La tercera nota vale el 40%.
     */


    // Funcion para calcular la nota final
    public static double calcularNotaFinal(double n1, double n2, double n3) {
        return (n1 * 0.3) + (n2 * 0.3) + (n3 * 0.4);
    }

    public static void main(String[] args) {

        // Scanner lector permite pedir informacion al usuario
        Scanner lector = new Scanner(System.in);

        // Creamos las 3 variables
        double n1, n2, n3, notaFinal;

        // Pedimos al usuario que ingrese la primera nota
        System.out.println("Ingrese la primera nota:");
        n1 = lector.nextDouble();

        System.out.println("Ingrese la segunda nota:");
        n2 = lector.nextDouble();

        System.out.println("Ingrese la tercera nota:");
        n3 = lector.nextDouble();

        // Invocamos a la funcion dentro de una variable para calcular la nota final
        notaFinal = calcularNotaFinal(n1, n2, n3);

        System.out.println("La nota final del estudiante es: " + notaFinal);

    }

}
