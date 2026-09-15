package PokMonBattlePOO;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

    	System.out.println("_-_-POKMON-_-_");
    	System.out.println();
    	System.out.println();
    	
    	
    	Combate combate = new Combate();

        System.out.println();
        System.out.println("==========================");
        System.out.println("   SELECCION DE EQUIPO");
        System.out.println("==========================");


        // ENTRENADOR 1

        System.out.println();
        System.out.println("Entrenador: "
                + combate.entrenador1.getNombre());

        for (int i = 0; i < 5; i++) {

            System.out.println();
            System.out.println("Elige tu Pokmon (" + (i + 1) + "/5)");

            for (int j = 0; j < combate.pokmonsDisponibles.size(); j++) {

                System.out.println((j + 1) + ". "
                        + combate.pokmonsDisponibles.get(j).getNombre()
                        + " - "
                        + combate.pokmonsDisponibles.get(j).getTipo());
            }

            int opcion = 0;
            boolean valido = false;

            while (!valido) {

                System.out.print("Pokmon: ");

                if (teclado.hasNextInt()) {

                    opcion = teclado.nextInt();

                    if (opcion >= 1
                            && opcion <= combate.pokmonsDisponibles.size()) {

                        valido = true;

                    } else {

                        System.out.println("Opcion invalida.");
                    }

                } else {

                    System.out.println("Opcion invalida. Introduce un numero.");

                    teclado.next();
                }
            }

            PokMon pokmonEscogido =
                    combate.pokmonsDisponibles.get(opcion - 1);

            combate.entrenador1.añadirPokmon(pokmonEscogido);

            combate.pokmonsDisponibles.remove(pokmonEscogido);
        }


        // ENTRENADOR 2

        System.out.println();
        System.out.println("==========================");
        System.out.println("Ahora elige "
                + combate.entrenador2.getNombre());
        System.out.println("==========================");

        for (int i = 0; i < 5; i++) {

            System.out.println();
            System.out.println("Elige tu Pokmon (" + (i + 1) + "/5)");

            for (int j = 0; j < combate.pokmonsDisponibles.size(); j++) {

                System.out.println((j + 1) + ". "
                        + combate.pokmonsDisponibles.get(j).getNombre()
                        + " - "
                        + combate.pokmonsDisponibles.get(j).getTipo());
            }

            int opcion = 0;
            boolean valido = false;

            while (!valido) {

                System.out.print("Pokmon: ");

                if (teclado.hasNextInt()) {

                    opcion = teclado.nextInt();

                    if (opcion >= 1
                            && opcion <= combate.pokmonsDisponibles.size()) {

                        valido = true;

                    } else {

                        System.out.println("Opcion invalida.");
                    }

                } else {

                    System.out.println("Opcion invalida. Introduce un numero.");

                    teclado.next();
                }
            }

            PokMon pokmonEscogido =
                    combate.pokmonsDisponibles.get(opcion - 1);

            combate.entrenador2.añadirPokmon(pokmonEscogido);

            combate.pokmonsDisponibles.remove(pokmonEscogido);
        }


        // MOSTRAR EQUIPOS

        System.out.println();
        System.out.println("==========================");
        System.out.println("Equipo de "
                + combate.entrenador1.getNombre());
        System.out.println("==========================");

        combate.entrenador1.mostrarEquipo();


        System.out.println();
        System.out.println("==========================");
        System.out.println("Equipo de "
                + combate.entrenador2.getNombre());
        System.out.println("==========================");

        combate.entrenador2.mostrarEquipo();


        // POKMON INICIALES

        combate.pokEnt1 =
                combate.entrenador1.getPokMonActual();

        combate.pokEnt2 =
                combate.entrenador2.getPokMonActual();


        // INICIAR COMBATE

        Combate.iniciarCombate();
    }
}