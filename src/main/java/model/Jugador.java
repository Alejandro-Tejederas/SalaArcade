package model;

public class Jugador {

    private String nombre;
    private int id;
    private int creditos;
    private int partidasJugadas;

    public Jugador() {

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
        this.id = id;
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

    public void recargarCreditos(){
        this.creditos++;
    }

    public void gastarCreditos(){
        if(this.creditos<=0){
            //no se pueden gastar, no hay
        }else{
            this.creditos--;
        }
    }

    public void incrementarPartidas(){
        this.partidasJugadas++;
    }

    public String mosrarInfo() {
        return "Nombre: " +this.nombre +
                "\nCreditos: " +this.creditos +
                "\nID: " +this.id +
                "\nPartidasJugadas: " +this.partidasJugadas;
    }
}

