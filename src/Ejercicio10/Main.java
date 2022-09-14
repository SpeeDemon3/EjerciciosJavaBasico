package Ejercicio10;

import java.util.Scanner;

public class Main {
    /**
     * Programa para comprobar si una palabra es palíndroma.
     * Ejemplos:
     * - Reconocer
     * - Anna
     * - Oja rojo
     *
     * Tener en cuenta que no se tiene en cuenta ni los espacios ni las mayúsculas ni las tildes
     */

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase(); // Pasamos todo a minusculas
        palabra = palabra.replace(" ", ""); // Quitamos los espacios en caso de ser una frase
        // Quitamos las tildes:
        palabra = palabra.replace("á", "a");
        palabra = palabra.replace("é", "e");
        palabra = palabra.replace("í", "i");
        palabra = palabra.replace("ó", "o");
        palabra = palabra.replace("ú", "u");

        int a = 0;
        int b = palabra.length() - 1; // Indice de la ultima letra

        for(int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(a) == palabra.charAt(b)) { // Comprobamos con charAt() los extremos y los comparamos
                a++; // Seguimos avanzando desde la izquiera de la frase
                b--; // Seguimos avanzando desde la derecha de la frase
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        String palabra;

        System.out.println("Ingrese una frase o una palabra: ");
        palabra = usuario.nextLine();

        if(esPalindromo(palabra)) {
            System.out.println("Es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }


    }


}
