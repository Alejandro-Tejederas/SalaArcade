package model;

public class Jugador {
    private static int contadorIds = 1;

    private String nombre;
    private final int id;
    private int creditos;
    private int partidasJugadas;

    public Jugador() {
        this.nombre = "Nombre jugador";
        this.id = contadorIds++;
        this.creditos = creditos;
        this.partidasJugadas = 0;

    }

    public  Jugador(String nombre, int id, int creditos, int partidasJugadas) throws Exception {
        this.nombre = nombre;
        this.id = id;
        this.creditos = creditos;
        this.partidasJugadas = partidasJugadas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

    }
    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public String toString() {
        return "Nombre: " +this.nombre +
                "\nCreditos: " +this.creditos +
                "\nID: " +this.id +
                "\nPartidasJugadas: " +this.partidasJugadas;
    }

    private boolean validaId(String id) {
        boolean valido = false;
        if(id.length() == 20) {
            valido = true;
        }
        return valido;
    }
}

