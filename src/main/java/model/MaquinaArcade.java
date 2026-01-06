package model;

import util.Utils;
import java.util.Arrays;


public class MaquinaArcade {

    private String nombre;
    private String genero;
    private int precioPorPartida; // Cuántos créditos cuesta jugar una vez
    private boolean activa; // true = funciona, false = estropeada/mantenimiento
    private int contadorPartidas; // Cuenta cuántas veces se ha jugado desde el último arreglo

    private int[] rankingPuntuaciones;    //Array de tamaño 3 para guardar los puntos por ej, (2000, 600, 100)
    private String[] rankingJugadores;    //Array de tamaño 3 para guardar los nombres por ej, (Ana, Luis, Pepe)

    public MaquinaArcade() {    //Constructor vacio
        this.rankingPuntuaciones = new int[3];
        this.rankingJugadores = new String[3];
        this.activa = true; // Cuano la creamos suponemos que funciona

    }

    //Constructor con parametros (para crear la maquina con los datos)
    public MaquinaArcade(String nombre, String genero, int precioPorPartida){
        this.nombre = nombre;
        this.genero = genero;
        this.precioPorPartida = precioPorPartida;
        this.activa = true; // cuando la creamos esta activa
        this.contadorPartidas = 0; // cuando la creamos tiene tambien 0 partiddas

        // aquí empezamos los huecos para el ranking
        this.rankingPuntuaciones = new int[3];
        this.rankingJugadores = new  String[3];
    }

    // GETTERS Y SETTERS (Para leer y escribir datos privados)
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecioPorPartida() {
        return precioPorPartida;
    }

    public void setPrecioPorPartida(int precioPorPartida) {
        this.precioPorPartida = precioPorPartida;
    }

    public boolean isActiva() { // Ponemos "is" porque el getter de los booleans es asi
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getContadorPartidas() {
        return contadorPartidas;
    }

    public void setContadorPartidas(int contadorPartidas) {
        this.contadorPartidas = contadorPartidas;
    }

    // Necesitamos estos getters que hay a continuacion para ver el ranking desde fuera (opción 11 del menú)
    public int[] getRankingPuntuaciones() {
        return rankingPuntuaciones;
    }

    public String[] getRankingJugadores() {
        return rankingJugadores;
    }

    // ACTIVAR LA MAQUINA
    public void activar() {
            this.activa = true; // Reactiva la máquina después de un mantenimiento
    }

    public void desactivar(){
            this.activa = false; // Pone la máquina en mantenimiento
    }


        public int jugarPartida(String nombreJugador){
            // Primero calculamos los puntos que ha sacado el jugador (usando la clase Utils)
            int puntuacion = Utils.generarNumeroAleatorio(0, 9999); // Genera un número entre 0 y 9999

            this.contadorPartidas++; //Incrementar contador de partidas

            if(contadorPartidas % 100 == 0){ //Si el contador es múltiplo de 100 se estropea
                desactivar();
            }

            actualizarRanking(nombreJugador, puntuacion); // Comprobamos si ha entrado en el Top 3

            return puntuacion;
        }


        //Actualizar el raking top 3
        private void actualizarRanking(String nombreJugador, int puntuacion){
            for(int i = 0; i < 3; i++){ // Sirve para ver el top 3
                if (puntuacion > rankingPuntuaciones[i]) {
                    for (int j = 2; j > i; j--) {
                        rankingPuntuaciones[j] = rankingPuntuaciones[j - 1]; // Copia puntos
                        rankingJugadores[j] = rankingJugadores[j - 1];       // Copia nombre
                    }
                }
                rankingPuntuaciones[i] = puntuacion;
                rankingJugadores[i] = nombreJugador;
                break; //para parar el proceso
        }
    }

    // el to string sirve para imprimir la máquina por consola)
    @Override
    public String toString() {
        return "MaquinaArcade{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", precioPorPartida=" + precioPorPartida +
                ", activa=" + activa +
                ", contadorPartidas=" + contadorPartidas +
                ", rankingPuntuaciones=" + Arrays.toString(rankingPuntuaciones) +
                ", rankingJugadores=" + Arrays.toString(rankingJugadores) +
                '}';
    }

    public String mostrarInformacionMaquinaArcade() {
        return "MaquinaArcade{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", precioPorPartida=" + precioPorPartida +
                ", activa=" + activa +
                ", contadorPartidas=" + contadorPartidas +
                ", rankingPuntuaciones=" + Arrays.toString(rankingPuntuaciones) +
                ", rankingJugadores=" + Arrays.toString(rankingJugadores) +
                '}';
    }


}



