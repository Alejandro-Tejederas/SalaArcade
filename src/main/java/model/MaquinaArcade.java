package model;

import util.Utils;

import java.util.Arrays;
import java.util.Random;

public class MaquinaArcade {
    Utils utils = new Utils();
    private String nombre;
    private String genero;
    private int precioPorPartida;
    private boolean activa;
    private int contadorPartidas;

    private int[] rankingPuntuaciones;      //Array de tamaño 3
    private String[] rankingJugadores;      //Array de tamaño 3

    public MaquinaArcade() {

    }

    public MaquinaArcade(String nombre, String genero, int precioPorPartida, boolean activa, int contadorPartidas, int[] rankingPuntuaciones, String[] rankingJugadores) {
        this.nombre = nombre;
        this.genero = genero;
        this.precioPorPartida = precioPorPartida;
        this.activa = activa;
        this.contadorPartidas = contadorPartidas;
        this.rankingPuntuaciones = rankingPuntuaciones;
        this.rankingJugadores = rankingJugadores;
    }

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

    public boolean isActiva() {
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

    public int[] getRankingPuntuaciones() {
        return rankingPuntuaciones;
    }

    public void setRankingPuntuaciones(int[] rankingPuntuaciones) {
        this.rankingPuntuaciones = rankingPuntuaciones;
    }

    public String[] getRankingJugadores() {
        return rankingJugadores;
    }

    public void setRankingJugadores(String[] rankingJugadores) {
        this.rankingJugadores = rankingJugadores;
    }

    /**
     * Activar maquina
     */
    public void activar() {
            this.activa = true;
    }

    public void desactivar(){
            this.activa = false;
    }

    public boolean estaActiva() {
            return activa;
    }


        public int jugarPartida(String nombreJugador){
            int puntuacion= utils.generarNumeroAleaori();

            //Incrementar contador de partidas
            this.contadorPartidas++;

            //Si el contador es múltiplo de 100
            if(contadorPartidas % 100 == 0){
                desactivar();
            }

            actualizarRanking(nombreJugador, puntuacion);

            return puntuacion;

        }


        //Actualizar el raking top 3

        private void actualizarRanking(String nombreJugador, int puntuacion){

            for(int i = 0; i < 3; i++){
                if(puntuacion == rankingPuntuaciones[i]){
                    for(int j=2; j>i; j--) {
                        rankingPuntuaciones[j] = rankingPuntuaciones[j-1];
                        rankingJugadores[j] = rankingJugadores[j-1];
                    }
                }
                rankingPuntuaciones[i] = puntuacion;
                rankingJugadores[i] = nombreJugador;
                break;
        }
    }

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



