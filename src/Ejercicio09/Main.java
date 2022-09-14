package Ejercicio09;

import java.util.Scanner;

public class Main {
    /**
     * Programa que calcule el IMC de una persona dado su peso y altura.
     *      IMC           CLASIFICACION
     *-----------------------------------------
     *    <18.5        -> Bajo peso
     *  18.5 - 24.9    -> Normal
     *  25.0 - 29.9    -> Sobrepeso
     *  30.0 - 34.9    -> Obesidad I
     *  35.0 - 39.9    -> Obesidad II
     *  40.0 - 49.9    -> Obesidad III
     *     > 50.0      -> Obesidad IV
     *
     * IMC = peso / (estatura * estatura)
     */

    // Funcion para calcular IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }

    // Funcion para saber el nivel de peso
    public static String nivelDePeso(double IMC) {
        if (IMC < 18.5)
            return "Bajo peso";
        else if (IMC >= 18.5 && IMC <= 24.9) {
            return "Normal";
        } else if (IMC >= 25 && IMC <= 29.9) {
            return "Sobrepeso";
        } else if (IMC >= 30 && IMC <= 34.9) {
            return "Obesidad I";
        } else if (IMC >= 35 && IMC <= 39.9) {
            return "Obesidad II";
        } else if (IMC >= 40 && IMC <= 49.9) {
            return "Obesidad III";
        }else
            return "Obesidad IV";

    }

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        double peso, altura;

        System.out.println("Ingrese su peso (kg): ");
        peso = usuario.nextDouble();

        System.out.println("Ingrese su altura (m): ");
        altura = usuario.nextDouble();

        System.out.println("Su nivel de peso es: " + nivelDePeso(calcularIMC(peso, altura)));


    }

}
