package util;

import java.util.Random;

public class Utils {
    //leeEntero(String mensaje) → pide un número por consola
    //● comprobarRango(int valor, int min, int max) → retorna booleano
    //indicando si está dentro del rango
    //● generarNumeroAleatorio(int min, int max) → útil si se quiere generar
    //puntuaciones o créditos automáticos

    public int generarNumeroAleaori(){
        Random random = new Random(); //numero aleatorio

        // Generar puntuación aleatoria 0-9999
        return random.nextInt(10000);
    }

    public boolean comprobarRango(int valor, int min, int max){
        if(valor<min && valor>max){
            return true;
        }else{
            return false;
        }
    }
}
