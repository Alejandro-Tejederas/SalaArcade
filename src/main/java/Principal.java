import model.Jugador;
import model.MaquinaArcade;
import model.SalaRecreativa;
import util.Utils;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args){

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
                    System.out.println("0. Salir");

                    int opcion = Utils.leeEntero("Elige una opción: ");

                    switch (opcion) {

                        case 1: //registrar jugador
                            System.out.println("Nuevo jugador");
                            Jugador jNuevo = new Jugador(sc.nextLine(), Utils.leeEntero("ID: "), Utils.leeEntero("Créditos: "), 0);

                            if (sala.registrarJugador(jNuevo)) {
                                System.out.println("Registrado");
                            } else {
                                System.out.println("Error: Sala llena");
                            }
                            break;

                        case 2: //registrar maquina
                            System.out.println("Registrar nueva máquina arcade");
                            MaquinaArcade mNueva = new MaquinaArcade(sc.nextLine(), sc.nextLine(), Utils.leeEntero("Precio: "));
                            if (sala.registrarMaquina(mNueva)) {
                                System.out.println("Máquina creada");
                            } else {
                                System.out.println("Error: Sala llena");
                            }
                            break;

                        case 3://recargar creditos
                            Jugador jRecarga = sala.buscarJugador(Utils.leeEntero("ID Jugador: "));

                            if (jRecarga != null) {
                                jRecarga.recargarCreditos(Utils.leeEntero("Cantidad a recargar: "));
                                System.out.println("Saldo actual: " + jRecarga.getCreditos());
                            } else {
                                System.out.println("Jugador no encontrado.");
                            }
                            break;

                        case 4:
                            System.out.println("Listar jugadores");
                            sala.listarJugadores();
                            break;

                        case 5:
                            System.out.println("Listar máquinas");
                            sala.listarMaquinas();
                            break;

                        case 6://
                            System.out.println("Listar máquinas activas");
                            sala.listarMaquinasActivas();
                            break;

                        case 7:
                            MaquinaArcade mReparar = sala.buscarMaquina(sc.nextLine());
                            if (mReparar != null) {
                                mReparar.activar();
                                System.out.println("Máquina reactivada.");
                            } else {
                                System.out.println("Máquina no existe.");
                            }
                            break;


                        case 8:
                            sala.gestionarPartida(Utils.leeEntero("ID Jugador: "), sc.nextLine());
                            break;

                        case 9:
                            System.out.println("Mostrar jugador más activo");
                            sala.mostrarJugadorMasActivo();
                            break;

                        case 10:
                            System.out.println("Mostrar máquina más usada");
                            sala.mostrarMaquinaMasUsada();
                            break;

                        case 11: //ranking
                            MaquinaArcade mRank = sala.buscarMaquina(sc.nextLine());
                            if (mRank != null) {
                                for (int i = 0; i < 3; i++) {
                                    System.out.println((i+1) + ". " + mRank.getRankingJugadores()[i] + " - " + mRank.getRankingPuntuaciones()[i]);
                                }
                            } else {
                                System.out.println("Máquina no existe.");
                            }
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



