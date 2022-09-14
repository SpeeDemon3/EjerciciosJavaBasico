package Ejercicio08;

import java.util.Scanner;

public class Main {
    /**
     * Programa que convierta una cnatidad de días, horas, minutos y segundos a segundos.
     */

    public static int calcularSegundos(int dias, int horas, int minutos, int segundo) {
        int segundosTotales = 0;

        segundosTotales += segundo;
        segundosTotales += minutos * 60;
        segundosTotales += horas * 60 * 60;
        segundosTotales += dias * 60 * 60 * 24;

        return segundosTotales;
    }

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        int dias, horas, minutos, segundos, segundosTotales;

        System.out.println("Ingrese la cantidad de días: ");
        dias = usuario.nextInt();

        System.out.println("Ingrese la cantidad de horas: ");
        horas = usuario.nextInt();

        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = usuario.nextInt();

        System.out.println("Ingrese la cantidad de segundos: ");
        segundos = usuario.nextInt();

        segundosTotales = calcularSegundos(dias, horas, minutos, segundos);

        System.out.println("El total de segundos es: " + segundosTotales + "segundos.");

    }

}

