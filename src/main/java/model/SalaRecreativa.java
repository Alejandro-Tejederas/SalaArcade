package model;

public class SalaRecreativa {

    private Jugador[] jugadores;
    private MaquinaArcade[] maquinas;

    public SalaRecreativa() {
        this.jugadores = new Jugador[10];
        this.maquinas = new MaquinaArcade[10];
    }

    //metodos de guardar
    public boolean registrarJugador(Jugador nuevoJugador) {  // Devuelve true si lo ha guardaddo, false si no hay sitio
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) { // Esto lo ponemos para buscar el primer hueco vacío
                jugadores[i] = nuevoJugador;
                return true; // Guardado
            }
        }
        return false; // si el array está lleno
    }

    public boolean registrarMaquina(MaquinaArcade nuevaMaquina) {
        for (int i = 0; i < maquinas.length; i++) {
            if (maquinas[i] == null) {
                maquinas[i] = nuevaMaquina;
                return true;
            }
        }
        return false;
    }

    // metodos de busqueda
    public Jugador buscarJugador(int id) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getId() == id) {
                return jugadores[i]; // Devolvemos el objeto jugador encontrado
            }
        }
        return null; // No existe
    }

    public MaquinaArcade buscarMaquina(String nombre) {
        for (int i = 0; i < maquinas.length; i++) {
            if (maquinas[i] != null && maquinas[i].getNombre().equals(nombre)) {// Usamos .equals() para comparar textos (Strings)
                return maquinas[i];
            }
        }
        return null;
    }

    // Listas
    public void listarJugadores() {
        System.out.println("--- LISTA DE JUGADORES ---");
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                System.out.println(jugadores[i].toString());
            }
        }
    }

    public void listarMaquinas() {
        System.out.println("--- LISTA DE MÁQUINAS ---");
        for (int i = 0; i < maquinas.length; i++) {
            if (maquinas[i] != null) {
                System.out.println(maquinas[i].toString());
                System.out.println("-------------------------");
            }
        }
    }

    // Opción 6 del menú
    public void listarMaquinasActivas() {
        System.out.println("--- MÁQUINAS ACTIVAS ---");
        for (int i = 0; i < maquinas.length; i++) {
            if (maquinas[i] != null && maquinas[i].isActiva()) {
                System.out.println(maquinas[i].toString());
            }
        }
    }

    public boolean gestionarPartida(int idJugador, String nombreMaquina) {
        Jugador jugador = buscarJugador(idJugador);
        MaquinaArcade maquina = buscarMaquina(nombreMaquina);

        if (jugador == null) {
            System.out.println("Error: El jugador no existe.");
            return false;
        }
        if (maquina == null) {
            System.out.println("Error: La máquina no existe.");
            return false;
        }

        if (!maquina.isActiva()) {
            System.out.println("Error: La máquina está en mantenimiento.");
            return false;
        }

        boolean cobrado = jugador.gastarCreditos(maquina.getPrecioPorPartida());

        if (cobrado) {
            int puntos = maquina.jugarPartida(jugador.getNombre());
            jugador.incrementarPartidas();

            System.out.println("¡Partida jugada! Puntuación obtenida: " + puntos);
            return true;
        } else {
            System.out.println("Error: Créditos insuficientes. Necesitas " + maquina.getPrecioPorPartida());
            return false;
        }
    }

    // Opciones 9 y 10
    public void mostrarJugadorMasActivo() {
        Jugador topJugador = null;
        int maxPartidas = -1;

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getPartidasJugadas() > maxPartidas) {
                    maxPartidas = jugadores[i].getPartidasJugadas();
                    topJugador = jugadores[i];
                }
            }
        }

        if (topJugador != null) {
            System.out.println("Jugador que ha jugado más: " + topJugador.getNombre() +
                    " con " + maxPartidas + " partidas.");
        } else {
            System.out.println("Aún no hay jugadores.");
        }
    }

    public void mostrarMaquinaMasUsada() {
        MaquinaArcade topMaquina = null;
        int maxPartidas = -1;

        for (int i = 0; i < maquinas.length; i++) {
            if (maquinas[i] != null) {
                if (maquinas[i].getContadorPartidas() > maxPartidas) {
                    maxPartidas = maquinas[i].getContadorPartidas();
                    topMaquina = maquinas[i];
                }
            }
        }

        if (topMaquina != null) {
            System.out.println("Máquina más popular: " + topMaquina.getNombre() +
                    " con " + maxPartidas + " partidas.");
        } else {
            System.out.println("Aún no hay máquinas.");
        }
    }
}