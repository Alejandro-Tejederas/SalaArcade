package model;

public class MaquinaArcade {

    private String nombre;
    private String genero;
    private int precioPartida;
    private int partidasJugadas;
    private boolean activa;
    private String[] rankingJugadores;      //Array de tamaño 3
    private String[] rankingPuntuaciones;   //Array de tamaño 3

    public MaquinaArcade(String nombre, String genero, int precioPartida) {
        this.nombre = nombre;
        this.genero = genero;
        this.precioPartida = precioPartida;
        this.partidasJugadas = 0;
        this.activa = true;

        this.rankingJugadores = new String[3];
        this.rankingPuntuaciones = new String[3];

        public void activar() {
            this.activa = true;
        }

        public void desactivar(){
            this.activa = false;
        }

        public boolean estaActiva() {
            return activa;
        }

        public int jugarPartida(String nombre){

            // Generar puntuación aleatoria 0-9999
            int puntuacion = random.nextInt(10000);

            //Incrementar contador de partidas
            partidasJugadas++;

            //Si el contador es múltiplo de 100
            if(partidasJugadas % 100 == 0){
                desactivar();

            }



        }


    }
}
