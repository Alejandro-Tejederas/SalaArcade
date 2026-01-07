package util;

import java.util.Scanner;
import java.util.Random;

public class Utils {


    private static Scanner sc = new Scanner(System.in); // creamos un scanner estatico para usarlo en el programa

    public static int leeEntero(String mensaje) { // Metodo para pedir enteros, evita fallos si se escriben letras
        int numero = 0;
        boolean leido = false;

        while (!leido) {
            try {
                System.out.println(mensaje); // 1. Muestra la pregunta
                numero = Integer.parseInt(sc.nextLine()); // 2. Intenta convertir el texto a número
                leido = true; // Si llegamos aquí, es que era un número válido
            } catch (NumberFormatException e) { // 4. Si el usuario escribe letras, el programa SALTA aquí (catch)
                System.out.println("Error: Introduce un número válido");
            }
        }
        return numero; //delvuelve un numero
    }

    public static boolean comprobarRango(int valor, int min, int max) { //Comprobar el rango
        return valor >= min && valor <= max; // Devuelve true si está dentro
    }

    public static int generarNumeroAleatorio(int min, int max) { //Generar un numero aleatorio entre dos valores
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}