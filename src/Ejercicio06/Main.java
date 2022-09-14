package Ejercicio06;

import java.util.Scanner;

public class Main {
    /**
     * Programa que calcule el nuevo salario de un trabajador
     * si obtuvo un incremento del x%.
     */

    public static double calcularIncrementoSalario(double salario, double x){
        double nuevoSalario;

        nuevoSalario = salario + (salario * (x / 100));
        return nuevoSalario;

    }

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        double salario;
        System.out.println("Ingrese el salario actual del trabajdor: ");
        salario = usuario.nextDouble();

        System.out.println("Ingrese el porcentaje de aumento que tendra el salario del trabajador: ");
        double x = usuario.nextInt();

        double nuevoSalario = calcularIncrementoSalario(salario, x);

        System.out.println("El nuevo salario es de: " + nuevoSalario);

    }

}
