package util;

import java.util.Scanner;
import java.util.Random;

public class Utils {

    // creamos un scanner estatico para usarlo en todo el programa
    private static Scanner sc = new Scanner(System.in);

    // Metodo para pedir enteros, evita fallos si se escriben letras
    public static int leeEntero(String mensaje) {
        int numero = 0;
        boolean leido = false;

        while (!leido) {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                leido = true; // Si llegamos aquí, es que era un número válido
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número válido");
            }
        }
        return numero;
    }

    public static boolean comprobarRango(int valor, int min, int max) { //Comprobar el rango
        return valor >= min && valor <= max; // Devuelve true si está dentro
    }

    public static int generarNumeroAleatorio(int min, int max) { //Generar un numero aleatorio entre dos valores
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}