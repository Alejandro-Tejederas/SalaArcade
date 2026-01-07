package model;      //Esto indica que pertenece a la clase model

public class Jugador {

    //ATRIBUTOS (Variables que guardan la información del jugador)
    private String nombre;
    private int id;
    private int creditos;
    private int partidasJugadas;

    //CONSTRUCTORES

    // Constructor vacío: este permite crear un jugador sin datos iniciales
    public Jugador() {

    }

    public  Jugador(String nombre, int id, int creditos, int partidasJugadas) { // Constructor con parámetros: permite crear un jugador y darle valores
        this.nombre = nombre; // Asigna el nombre recibido al atributo del objeto
        this.id = id; // Asigna el id
        this.creditos = creditos; // Asigna los créditos iniciales
        this.partidasJugadas = partidasJugadas; // Asigna las partidas iniciales

    }
    // GETTERS Y SETTERS (Getter= sirve para ver que hay dentro, setter= cambia el valor de la variable)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Cambia el nombre por uno nuevo
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; // Cambia el ID
    }
    public int getCreditos() {
        return creditos; // Consulta cuantos creditos tiene
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos; // Cambia los creditos manualmente
    }

    public int getPartidasJugadas() {
        return partidasJugadas; // Consulta cuantas partidas lleva
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    // Metodos de funciones (Lo que el jugador puede hacer)
    public void recargarCreditos(int cantidad){
        if(cantidad>0){ //Esto indica que solo recarga si la cantidad es positiva
            this.creditos = this.creditos + cantidad; // Suma la cantidad al saldo actual
        }
    }

    public boolean gastarCreditos(int precioPorPartida){  // Metodo para gastar creditos, devuelve true si se puede gastar y false si no hay creditos
        if (this.creditos >= precioPorPartida) { // Comprueba si tiene saldo suficiente
            this.creditos = this.creditos - precioPorPartida; // Resta el precio
            return true; // Pudo gastar creditos
        } else {
            return false; // No tiene dinero suficiente
        }
    }

    public void incrementarPartidas(){
        this.partidasJugadas++; // Suma 1 al contador de partidas jugadas
    }

    public String toString() { // El toString sirve para convertir el objeto en un texto para imprimirlo de forma legible
        return "Nombre: " +this.nombre +
                "\nCreditos: " +this.creditos +
                "\nID: " +this.id +
                "\nPartidasJugadas: " +this.partidasJugadas;
    }

    public String mostrarInfo() {
        return "Nombre: " +this.nombre +
                "\nCreditos: " +this.creditos +
                "\nID: " +this.id +
                "\nPartidasJugadas: " +this.partidasJugadas;
    }
}

