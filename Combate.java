package PokemonBattlePOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Combate {

    static Scanner teclado = new Scanner(System.in);

    static Entrenador entrenador1;

    static Entrenador entrenador2;

    static Pokemon pokEnt1;

    static Pokemon pokEnt2;

    static Boolean finCombate = false;

    ArrayList<Pokemon> pokemonsDisponibles = new ArrayList<>();

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


        // POKEMON

        Pokemon pok1 = new Pokemon("Charmander", Tipo.FUEGO);
        Pokemon pok2 = new Pokemon("Squirtle", Tipo.AGUA);
        Pokemon pok3 = new Pokemon("Bulbasaur", Tipo.PLANTA);
        Pokemon pok4 = new Pokemon("Pikachu", Tipo.ELECTRICO);

        Pokemon pok5 = new Pokemon("Charizard", Tipo.FUEGO);
        Pokemon pok6 = new Pokemon("Blastoise", Tipo.AGUA);
        Pokemon pok7 = new Pokemon("Ivysaur", Tipo.PLANTA);
        Pokemon pok8 = new Pokemon("Raichu", Tipo.ELECTRICO);

        Pokemon pok9 = new Pokemon("Vulpix", Tipo.FUEGO);
        Pokemon pok10 = new Pokemon("Psyduck", Tipo.AGUA);
        Pokemon pok11 = new Pokemon("Oddish", Tipo.PLANTA);
        Pokemon pok12 = new Pokemon("Magnemite", Tipo.ELECTRICO);

        Pokemon pok13 = new Pokemon("Growlithe", Tipo.FUEGO);
        Pokemon pok14 = new Pokemon("Poliwag", Tipo.AGUA);
        Pokemon pok15 = new Pokemon("Chikorita", Tipo.PLANTA);
        Pokemon pok16 = new Pokemon("Mareep", Tipo.ELECTRICO);

        Pokemon pok17 = new Pokemon("Cyndaquil", Tipo.FUEGO);
        Pokemon pok18 = new Pokemon("Totodile", Tipo.AGUA);
        Pokemon pok19 = new Pokemon("Bellsprout", Tipo.PLANTA);
        Pokemon pok20 = new Pokemon("Electabuzz", Tipo.ELECTRICO);


        // POKEMON DISPONIBLES PARA ELEGIR

        pokemonsDisponibles.add(pok1);
        pokemonsDisponibles.add(pok2);
        pokemonsDisponibles.add(pok3);
        pokemonsDisponibles.add(pok4);
        pokemonsDisponibles.add(pok5);
        pokemonsDisponibles.add(pok6);
        pokemonsDisponibles.add(pok7);
        pokemonsDisponibles.add(pok8);
        pokemonsDisponibles.add(pok9);
        pokemonsDisponibles.add(pok10);
        pokemonsDisponibles.add(pok11);
        pokemonsDisponibles.add(pok12);
        pokemonsDisponibles.add(pok13);
        pokemonsDisponibles.add(pok14);
        pokemonsDisponibles.add(pok15);
        pokemonsDisponibles.add(pok16);
        pokemonsDisponibles.add(pok17);
        pokemonsDisponibles.add(pok18);
        pokemonsDisponibles.add(pok19);
        pokemonsDisponibles.add(pok20);


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

                Pokemon.atacar(pokEnt1, pokEnt2, mov1);


                // COMPROBAR SI MUERE POKEMON 2

                if (pokEnt2.getVida() <= 0) {

                    System.out.println("Tu compañero se ha debilitado...");

                    entrenador2.quitarPokemon(pokEnt2);

                    if (entrenador2.getEquipo().isEmpty()) {

                        System.out.println();
                        System.out.println("Perdio " + entrenador2.getNombre());
                        System.out.println("Gana " + entrenador1.getNombre());

                        finCombate = true;

                    } else {

                        System.out.println("Cambia de compañero");

                        entrenador2.cambiarPok();

                        pokEnt2 = entrenador2.getPokemonActual();
                    }
                }


                // SOLO ATACA ENTRENADOR 2 SI EL COMBATE CONTINUA

                if (!finCombate) {

                    System.out.println();

                    Pokemon.atacar(pokEnt2, pokEnt1, mov2);


                    // COMPROBAR SI MUERE POKEMON 1

                    if (pokEnt1.getVida() <= 0) {

                        System.out.println("Tu compañero se ha debilitado...");

                        entrenador1.quitarPokemon(pokEnt1);

                        if (entrenador1.getEquipo().isEmpty()) {

                            System.out.println();
                            System.out.println("Perdio " + entrenador1.getNombre());
                            System.out.println("Gana " + entrenador2.getNombre());

                            finCombate = true;

                        } else {

                            System.out.println("Cambia de compañero");

                            entrenador1.cambiarPok();

                            pokEnt1 = entrenador1.getPokemonActual();
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
                        + "?? Su pokemon es "
                        + pokEnt1.getNombre());

                pokEnt1.mostrarMovimientos();

                System.out.print("Movimiento: ");

                Movimiento mov2 = pokEnt1.movimientos.get(teclado.nextInt() - 1);


                // ATACA ENTRENADOR 2

                Pokemon.atacar(pokEnt2, pokEnt1, mov1);


                // COMPROBAR SI MUERE POKEMON 1

                if (pokEnt1.getVida() <= 0) {

                    System.out.println("Tu compañero se ha debilitado...");

                    entrenador1.quitarPokemon(pokEnt1);

                    if (entrenador1.getEquipo().isEmpty()) {

                        System.out.println();
                        System.out.println("Perdio " + entrenador1.getNombre());
                        System.out.println("Gana " + entrenador2.getNombre());

                        finCombate = true;

                    } else {

                        System.out.println("Cambia de compañero");

                        entrenador1.cambiarPok();

                        pokEnt1 = entrenador1.getPokemonActual();
                    }
                }


                // SOLO ATACA ENTRENADOR 1 SI EL COMBATE CONTINUA

                if (!finCombate) {

                    System.out.println();

                    Pokemon.atacar(pokEnt1, pokEnt2, mov2);


                    // COMPROBAR SI MUERE POKEMON 2

                    if (pokEnt2.getVida() <= 0) {

                        System.out.println("Tu compañero se ha debilitado...");

                        entrenador2.quitarPokemon(pokEnt2);

                        if (entrenador2.getEquipo().isEmpty()) {

                            System.out.println();
                            System.out.println("Perdio " + entrenador2.getNombre());
                            System.out.println("Gana " + entrenador1.getNombre());

                            finCombate = true;

                        } else {

                            System.out.println("Cambia de compañero");

                            entrenador2.cambiarPok();

                            pokEnt2 = entrenador2.getPokemonActual();
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