package Ejercicio04;

import java.util.Scanner;


public class Main {
    /**
     * Programa que valide si una contraseña especificada por el usuario es segura
     * Una contraseña segura:
     * -> Tiene más de 8 caracteres
     * -> Tiene al menos una letra mayúscula
     * -> Tiene al menos un número
     */

    public static boolean esSegura(String password) {
        if (password.length() > 8) {
            boolean mayuscula = false;
            boolean numero = false;
            char c;

            for (int i = 0; i < password.length(); i++) {
                c = password.charAt(i);
                if (Character.isDigit(c)) ;
                numero = true;
                if (Character.isUpperCase(c)) ;
                mayuscula = true;
            }

            if (mayuscula && numero) {
                return true;
            } else {
                return false;

            }
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        String password;

        System.out.println("Ingrese una contraseña: ");
        password = usuario.next();

        if (esSegura(password)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura");
        }
    }
}
