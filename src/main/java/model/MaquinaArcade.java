package model;

public class MaquinaArcade {

    private String nombre;
    private String genero;
    private int precioPorPartida;
    private boolean activa;
    private int contadorPartidas;

    private int[] rankingPuntuaciones;      //Array de tamaño 3
    private String[] rankingJugadores;      //Array de tamaño 3

    private Random random = new Random();

    public MaquinaArcade(String nombre, String genero, int precioPartida) {
        this.nombre = nombre;
        this.genero = genero;
        this.precioPorPartida = precioPorPartida;
        this.activa = true;
        this.contadorPartidas = 0;


        this.rankingJugadores = new String[3];
        this.rankingPuntuaciones = new int[3];


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

            // Generar puntuación aleatoria 0-9999
            int puntuacion = random.nextInt(10000);

            //Incrementar contador de partidas
            contadorPartidas++;

            //Si el contador es múltiplo de 100
            if(contadorPartidas % 100 == 0){
                desactivar();

            }

            actualizarRanking(nombreJugador, puntuacion);

            return puntuacion

        }


        //Actualizar el raking top 3

        private void actualizarRanking(String nombreJugador, int puntuacion){

            for(int i = 0; i < 3; i++){
                if(puntuacion == rankingPuntuaciones[i]){

            for(int j=2; j>i; j--)
                rankingPuntuaciones[j] = rankingPuntuaciones[j-1];
                rankingJugadores[j] = rankingJugadores;
            }


                rankingPuntuaciones[i] = puntuacion;
                rankingJugadores[i] = nombreJugador;
                break;
        }
    }
}

            public void mostrarInfo() {
    System.out.println("----- Máquina Arcade -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
            }
}
