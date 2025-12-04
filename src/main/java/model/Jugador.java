package model;

public class Jugador {
    private static int contadorIds = 1;

    private String nombre;
    private final int id;
    private int creditos;
    private int partidasJugadas;

    public Jugador(String nombre, int creditosIniciales) {
        this.nombre = nombre;
        this.id = contadorIds++;
        this.creditos = creditos;
        this.partidasJugadas = 0;

    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
    public int getCreditos() { return creditos; }
    public int getPartidasJugadas() { return partidasJugadas; }
}
