package model;

import java.util.Arrays;

public class SalaRecreativa {
    private Jugador[] jugadores;
    private MaquinaArcade[] maquinas;

    public SalaRecreativa() {
        jugadores = new Jugador[10];
        maquinas = new MaquinaArcade[10];
    }

    public SalaRecreativa(Jugador[] jugadores, MaquinaArcade[] maquinas) {
        this.jugadores = jugadores;
        this.maquinas = maquinas;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public MaquinaArcade[] getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(MaquinaArcade[] maquinas) {
        this.maquinas = maquinas;
    }

    public String toString() {
        return "SalaRecreativa{" +
                "jugadores=" + Arrays.toString(jugadores) +
                ", maquinas=" + Arrays.toString(maquinas) +
                '}';
    }

    public void registrarJugador() throws Exception {
        //inroduce el nombre
        Sring nombre= ""
                in id = j//inroduce el diid
        in credios= //inroduce los credios
        Jugador j = new Jugador("Alejanrod", 1, 100, 0);
    }

    public void BuscarJugadorID(in id){
        //inrodcuce un id
        if(id== )
    }

    publi c void lisarJugadores(){
        Jjug
                jugadores.toString();
    }
}
