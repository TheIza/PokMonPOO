package PokMonBattlePOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Combate {

    static Scanner teclado = new Scanner(System.in);

    static Entrenador entrenador1;

    static Entrenador entrenador2;

    static PokMon pokEnt1;

    static PokMon pokEnt2;

    static Boolean finCombate = false;

    ArrayList<PokMon> pokmonsDisponibles = new ArrayList<>();

    public Combate() {

        entrenador1 = new Entrenador("Ash mostaza");

        entrenador2 = new Entrenador("MkWen");


        // MOVIMIENTOS

        Movimiento mov1 = new Movimiento("Ascuas", Tipo.FUEGO, 40, 100);
        Movimiento mov2 = new Movimiento("Lanzallamas", Tipo.FUEGO, 40, 100);
        Movimiento mov3 = new Movimiento("Nitrocarga", Tipo.FUEGO, 50, 100);
        Movimiento mov4 = new Movimiento("Colmillo Igneo", Tipo.FUEGO, 65, 95);
        Movimiento mov5 = new Movimiento("Giro Fuego", Tipo.FUEGO, 35, 100);
        Movimiento mov6 = new Movimiento("Envite Igneo", Tipo.FUEGO, 100, 85);
        Movimiento mov7 = new Movimiento("Llamarada", Tipo.FUEGO, 110, 85);
        Movimiento mov8 = new Movimiento("Puño Fuego", Tipo.FUEGO, 75, 100);

        Movimiento mov9 = new Movimiento("Pistola Agua", Tipo.AGUA, 40, 100);
        Movimiento mov10 = new Movimiento("Hidrobomba", Tipo.AGUA, 110, 80);
        Movimiento mov11 = new Movimiento("Surf", Tipo.AGUA, 90, 100);
        Movimiento mov12 = new Movimiento("Acua Jet", Tipo.AGUA, 40, 100);
        Movimiento mov13 = new Movimiento("Cascada", Tipo.AGUA, 80, 100);
        Movimiento mov14 = new Movimiento("Acua Cola", Tipo.AGUA, 90, 90);
        Movimiento mov15 = new Movimiento("Escaldar", Tipo.AGUA, 80, 100);

        Movimiento mov16 = new Movimiento("Latigo Cepa", Tipo.PLANTA, 45, 100);
        Movimiento mov17 = new Movimiento("Hoja Afilada", Tipo.PLANTA, 55, 95);
        Movimiento mov18 = new Movimiento("Gigadrenado", Tipo.PLANTA, 75, 100);
        Movimiento mov19 = new Movimiento("Energibola", Tipo.PLANTA, 90, 100);
        Movimiento mov20 = new Movimiento("Rayo Solar", Tipo.PLANTA, 120, 100);
        Movimiento mov21 = new Movimiento("Bomba Germen", Tipo.PLANTA, 80, 100);
        Movimiento mov22 = new Movimiento("Hoja Aguda", Tipo.PLANTA, 90, 100);

        Movimiento mov23 = new Movimiento("Impactrueno", Tipo.ELECTRICO, 40, 100);
        Movimiento mov24 = new Movimiento("Onda Trueno", Tipo.ELECTRICO, 0, 100);
        Movimiento mov25 = new Movimiento("Rayo", Tipo.ELECTRICO, 90, 100);
        Movimiento mov26 = new Movimiento("Chispa", Tipo.ELECTRICO, 65, 100);
        Movimiento mov27 = new Movimiento("Voltio Cruel", Tipo.ELECTRICO, 90, 100);
        Movimiento mov28 = new Movimiento("Trueno", Tipo.ELECTRICO, 110, 70);
        Movimiento mov29 = new Movimiento("Puño Trueno", Tipo.ELECTRICO, 75, 100);
        Movimiento mov30 = new Movimiento("Electrocañon", Tipo.ELECTRICO, 120, 50);


        Movimiento.listaMovimientos.add(mov1);
        Movimiento.listaMovimientos.add(mov2);
        Movimiento.listaMovimientos.add(mov3);
        Movimiento.listaMovimientos.add(mov4);
        Movimiento.listaMovimientos.add(mov5);
        Movimiento.listaMovimientos.add(mov6);
        Movimiento.listaMovimientos.add(mov7);
        Movimiento.listaMovimientos.add(mov8);

        Movimiento.listaMovimientos.add(mov9);
        Movimiento.listaMovimientos.add(mov10);
        Movimiento.listaMovimientos.add(mov11);
        Movimiento.listaMovimientos.add(mov12);
        Movimiento.listaMovimientos.add(mov13);
        Movimiento.listaMovimientos.add(mov14);
        Movimiento.listaMovimientos.add(mov15);

        Movimiento.listaMovimientos.add(mov16);
        Movimiento.listaMovimientos.add(mov17);
        Movimiento.listaMovimientos.add(mov18);
        Movimiento.listaMovimientos.add(mov19);
        Movimiento.listaMovimientos.add(mov20);
        Movimiento.listaMovimientos.add(mov21);
        Movimiento.listaMovimientos.add(mov22);

        Movimiento.listaMovimientos.add(mov23);
        Movimiento.listaMovimientos.add(mov24);
        Movimiento.listaMovimientos.add(mov25);
        Movimiento.listaMovimientos.add(mov26);
        Movimiento.listaMovimientos.add(mov27);
        Movimiento.listaMovimientos.add(mov28);
        Movimiento.listaMovimientos.add(mov29);
        Movimiento.listaMovimientos.add(mov30);


        // POKMON

        PokMon pok1 = new PokMon("Charmander", Tipo.FUEGO);
        PokMon pok2 = new PokMon("Squirtle", Tipo.AGUA);
        PokMon pok3 = new PokMon("Bulbasaur", Tipo.PLANTA);
        PokMon pok4 = new PokMon("Pikachu", Tipo.ELECTRICO);

        PokMon pok5 = new PokMon("Charizard", Tipo.FUEGO);
        PokMon pok6 = new PokMon("Blastoise", Tipo.AGUA);
        PokMon pok7 = new PokMon("Ivysaur", Tipo.PLANTA);
        PokMon pok8 = new PokMon("Raichu", Tipo.ELECTRICO);

        PokMon pok9 = new PokMon("Vulpix", Tipo.FUEGO);
        PokMon pok10 = new PokMon("Psyduck", Tipo.AGUA);
        PokMon pok11 = new PokMon("Oddish", Tipo.PLANTA);
        PokMon pok12 = new PokMon("Magnemite", Tipo.ELECTRICO);

        PokMon pok13 = new PokMon("Growlithe", Tipo.FUEGO);
        PokMon pok14 = new PokMon("Poliwag", Tipo.AGUA);
        PokMon pok15 = new PokMon("Chikorita", Tipo.PLANTA);
        PokMon pok16 = new PokMon("Mareep", Tipo.ELECTRICO);

        PokMon pok17 = new PokMon("Cyndaquil", Tipo.FUEGO);
        PokMon pok18 = new PokMon("Totodile", Tipo.AGUA);
        PokMon pok19 = new PokMon("Bellsprout", Tipo.PLANTA);
        PokMon pok20 = new PokMon("Electabuzz", Tipo.ELECTRICO);


        // POKMON DISPONIBLES PARA ELEGIR

        pokmonsDisponibles.add(pok1);
        pokmonsDisponibles.add(pok2);
        pokmonsDisponibles.add(pok3);
        pokmonsDisponibles.add(pok4);
        pokmonsDisponibles.add(pok5);
        pokmonsDisponibles.add(pok6);
        pokmonsDisponibles.add(pok7);
        pokmonsDisponibles.add(pok8);
        pokmonsDisponibles.add(pok9);
        pokmonsDisponibles.add(pok10);
        pokmonsDisponibles.add(pok11);
        pokmonsDisponibles.add(pok12);
        pokmonsDisponibles.add(pok13);
        pokmonsDisponibles.add(pok14);
        pokmonsDisponibles.add(pok15);
        pokmonsDisponibles.add(pok16);
        pokmonsDisponibles.add(pok17);
        pokmonsDisponibles.add(pok18);
        pokmonsDisponibles.add(pok19);
        pokmonsDisponibles.add(pok20);


        // POKEMON INICIALES

        pokEnt1 = null;
        pokEnt2 = null;
    }


    public static void iniciarCombate() {

        System.out.println("|-------------------------|");
        System.out.println("| QUE COMIENCE EL COMBATE |");
        System.out.println("|-------------------------|");

        while (!finCombate) {

            if (pokEnt1.getVelocidad() > pokEnt2.getVelocidad()) {

                // COMIENZA ENTRENADOR 1

                System.out.println();
                System.out.println("Comienza " + entrenador1.getNombre()
                        + " con " + pokEnt1.getNombre());

                System.out.println("Que movimiento utilizara "
                        + pokEnt1.getNombre());

                pokEnt1.mostrarMovimientos();

                System.out.print("Movimiento: ");

                Movimiento mov1 = pokEnt1.movimientos.get(teclado.nextInt() - 1);


                System.out.println();
                System.out.println("--------");
                System.out.println();


                // ENTRENADOR 2 ELIGE SU MOVIMIENTO

                System.out.println("Con que contratacara "
                        + entrenador2.getNombre()
                        + "?? Su pokemon es "
                        + pokEnt2.getNombre());

                pokEnt2.mostrarMovimientos();

                System.out.print("Movimiento: ");

                Movimiento mov2 = pokEnt2.movimientos.get(teclado.nextInt() - 1);


                // ATACA ENTRENADOR 1

                PokMon.atacar(pokEnt1, pokEnt2, mov1);


                // COMPROBAR SI MUERE POKEMON 2

                if (pokEnt2.getVida() <= 0) {

                    System.out.println("Tu compañero se ha debilitado...");

                    entrenador2.quitarPokmon(pokEnt2);

                    if (entrenador2.getEquipo().isEmpty()) {

                        System.out.println();
                        System.out.println("Perdio " + entrenador2.getNombre());
                        System.out.println("Gana " + entrenador1.getNombre());

                        finCombate = true;

                    } else {

                        System.out.println("Cambia de compañero");

                        entrenador2.cambiarPok();

                        pokEnt2 = entrenador2.getPokMonActual();
                    }
                }


                // SOLO ATACA ENTRENADOR 2 SI EL COMBATE CONTINUA

                if (!finCombate) {

                    System.out.println();

                    PokMon.atacar(pokEnt2, pokEnt1, mov2);


                    // COMPROBAR SI MUERE POKEMON 1

                    if (pokEnt1.getVida() <= 0) {

                        System.out.println("Tu compañero se ha debilitado...");

                        entrenador1.quitarPokmon(pokEnt1);

                        if (entrenador1.getEquipo().isEmpty()) {

                            System.out.println();
                            System.out.println("Perdio " + entrenador1.getNombre());
                            System.out.println("Gana " + entrenador2.getNombre());

                            finCombate = true;

                        } else {

                            System.out.println("Cambia de compañero");

                            entrenador1.cambiarPok();

                            pokEnt1 = entrenador1.getPokMonActual();
                        }
                    }
                }


            } else {

                // COMIENZA ENTRENADOR 2

                System.out.println();
                System.out.println("Comienza " + entrenador2.getNombre()
                        + " con " + pokEnt2.getNombre());

                System.out.println("Que movimiento utilizara "
                        + pokEnt2.getNombre());

                pokEnt2.mostrarMovimientos();

                System.out.print("Movimiento: ");

                Movimiento mov1 = pokEnt2.movimientos.get(teclado.nextInt() - 1);


                System.out.println();
                System.out.println("--------");
                System.out.println();


                // ENTRENADOR 1 ELIGE SU MOVIMIENTO

                System.out.println("Con que contratacara "
                        + entrenador1.getNombre()
                        + "?? Su pokmon es "
                        + pokEnt1.getNombre());

                pokEnt1.mostrarMovimientos();

                System.out.print("Movimiento: ");

                Movimiento mov2 = pokEnt1.movimientos.get(teclado.nextInt() - 1);


                // ATACA ENTRENADOR 2

                PokMon.atacar(pokEnt2, pokEnt1, mov1);


                // COMPROBAR SI MUERE POKMON 1

                if (pokEnt1.getVida() <= 0) {

                    System.out.println("Tu compañero se ha debilitado...");

                    entrenador1.quitarPokmon(pokEnt1);

                    if (entrenador1.getEquipo().isEmpty()) {

                        System.out.println();
                        System.out.println("Perdio " + entrenador1.getNombre());
                        System.out.println("Gana " + entrenador2.getNombre());

                        finCombate = true;

                    } else {

                        System.out.println("Cambia de compañero");

                        entrenador1.cambiarPok();

                        pokEnt1 = entrenador1.getPokMonActual();
                    }
                }


                // SOLO ATACA ENTRENADOR 1 SI EL COMBATE CONTINUA

                if (!finCombate) {

                    System.out.println();

                    PokMon.atacar(pokEnt1, pokEnt2, mov2);


                    // COMPROBAR SI MUERE POKMON 2

                    if (pokEnt2.getVida() <= 0) {

                        System.out.println("Tu compañero se ha debilitado...");

                        entrenador2.quitarPokmon(pokEnt2);

                        if (entrenador2.getEquipo().isEmpty()) {

                            System.out.println();
                            System.out.println("Perdio " + entrenador2.getNombre());
                            System.out.println("Gana " + entrenador1.getNombre());

                            finCombate = true;

                        } else {

                            System.out.println("Cambia de compañero");

                            entrenador2.cambiarPok();

                            pokEnt2 = entrenador2.getPokMonActual();
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println(" ......FIN...... ");
    }
}