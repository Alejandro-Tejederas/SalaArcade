package model;

public class MaquinaArcade {

    private String nombre;
    private String genero;
    private int precioPartida;
    private int partidasJugadas;
    private boolean activa;
    private String[] rankingJugadores;      //Array de tamaño 3
    private String[] rankingPuntuaciones;   //Array de tamaño 3

    public MaquinaArcade(String Neonshooter, String disparos, int precioPartida) {
        this.nombre = Neonshooter;
        this.genero = disparos;
        this.precioPartida = precioPartida;
        this.partidasJugadas = 0;
        this.activa = true;
        this.rankingJugadores = new String[3];
        this.rankingPuntuaciones = new String[3];



    }
}
