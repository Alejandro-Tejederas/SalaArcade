import model.Jugador;
import model.MaquinaArcade;
import model.SalaRecreativa;
import util.Utils;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        Utils utils = new Utils();
        utils.comprobarRango(5,8,10);

        Jugador j = new Jugador();
        MaquinaArcade m = new MaquinaArcade();
        SalaRecreativa sala = new SalaRecreativa();
                Scanner sc = new Scanner(System.in);
                boolean salir = false;

                while (!salir) {

                    System.out.println("\n===== SALÓN ARCADE =====");
                    System.out.println("1. Registrar nuevo jugador");
                    System.out.println("2. Registrar nueva máquina arcade");
                    System.out.println("3. Recargar créditos a un jugador");
                    System.out.println("4. Listar jugadores");
                    System.out.println("5. Listar máquinas");
                    System.out.println("6. Listar máquinas activas");
                    System.out.println("7. Realizar mantenimiento a una máquina");
                    System.out.println("8. Jugar una partida");
                    System.out.println("9. Mostrar jugador más activo");
                    System.out.println("10. Mostrar máquina más usada");
                    System.out.println("11. Mostrar ranking de una máquina");
                    System.out.println("12. Dar de baja una máquina arcade");
                    System.out.println("13. Editar una máquina arcade");
                    System.out.println("0. Salir");

                    System.out.print("Elige una opción: ");
                    int opcion = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    switch (opcion) {

                        case 1:
                            System.out.println("Registrar nuevo jugador");
                            sala.registrarJugador();
                            break;

                        case 2:
                            System.out.println("Registrar nueva máquina arcade");
                            //sala
                            break;

                        case 3:
                            System.out.println("Recargar créditos a un jugador");
                            j.recargarCreditos();
                            break;

                        case 4:
                            System.out.println("Listar jugadores");
                            // listarJugadores();
                            break;

                        case 5:
                            System.out.println("Listar máquinas");
                            // listarMaquinas();
                            break;

                        case 6:
                            System.out.println("Listar máquinas activas");
                            // listarMaquinasActivas();
                            break;

                        case 7:
                            System.out.println("Realizar mantenimiento a una máquina");
                            // reactivarMaquina();
                            break;

                        case 8:
                            System.out.println("Jugar una partida");
                            // jugarPartida();
                            break;

                        case 9:
                            System.out.println("Mostrar jugador más activo");
                            // mostrarJugadorMasActivo();
                            break;

                        case 10:
                            System.out.println("Mostrar máquina más usada");
                            // mostrarMaquinaMasUsada();
                            break;

                        case 11:
                            System.out.println("Mostrar ranking de una máquina");
                            // mostrarRankingMaquina();
                            break;

                        case 12:
                            System.out.println("Dar de baja una máquina arcade");
                            // darDeBajaMaquina();
                            break;

                        case 13:
                            System.out.println("Editar una máquina arcade");
                            // editarMaquina();
                            break;

                        case 0:
                            salir = true;
                            System.out.println("Saliendo del programa...");
                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }
                }

                sc.close();
            }
        }

    }
}
