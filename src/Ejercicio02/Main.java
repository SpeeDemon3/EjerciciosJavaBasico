package Ejercicio02;

import java.util.Scanner;

public class Main {
    /**
     * Programa que calcule el IVA en una compra, siendo el IVA del 19%
     * sobre el valor total de la compra.
     */

    //Funcion para calcular IVA
    public static double calcularIVA(double precio) {
        double iva;
        iva = precio * 0.19;
        return iva;
    }


    public static void main(String[] args) {

        // Scanner lector permite pedir informacion al usuario
        Scanner comprador = new Scanner(System.in);

        // Variable
        double precioDeLaCompra;

        System.out.println("Ingrese el precio total de la compra: ");
        precioDeLaCompra = comprador.nextDouble();

        double iva = calcularIVA(precioDeLaCompra);

        System.out.println("El precio de la compra sin IVA es de: " + precioDeLaCompra);
        System.out.println("El precio de la compra con IVA incluido es de: " + (precioDeLaCompra + iva));

    }



}
