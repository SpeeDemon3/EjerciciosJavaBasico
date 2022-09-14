package Ejercicio05;

public class Main {

    /**
     * Programa que valide si un nmero es un nmero primo
     */

    public static boolean esPrimo(int n) {
        // Un número primo es divisible entre si mismo y entre 1.
        if (n <= 1) //Si n es menor a 1 devuelve falso
            return false;
        else if (n == 2) { // Si n es igual a 2 devuele true
            return true;
        } else {
            for(int i = 1; i < n; i++) { // Bucle que itera por los numeros y comprueba si es divisible entre 2
                if( n % 2 ==0)           // al ser divisible entre 2 ya no seria primo
                    return false;
            }
            return true;
        }

    }

    public static void main(String[] args) {

        for(int i = -10; i <= 50; i++) { // Bucle que itera desde el -10 hasta el 50
            System.out.println(i + " -> " + esPrimo(i)); // Con la función esPrimo() comprobamos si i es primo o no
        }

    }
}
