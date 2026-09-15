package PokemonBattlePOO;

import java.util.Scanner;

public class Combate {
	static Scanner teclado = new Scanner(System.in);

	static Entrenador entrenador1;
	static Entrenador entrenador2;

	static Pokemon pokEnt1 = entrenador1.getPokemonActual();
	static Pokemon pokEnt2 = entrenador2.getPokemonActual();

	static Boolean finCombate = false;

	public Combate(Entrenador entrenador1, Entrenador entrenador2) {
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
	}

	public static void iniciarPartidaPredeterminada() {

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

		Entrenador entrenador1 = new Entrenador("Ash mostaza");
		Entrenador entrenador2 = new Entrenador("MkWen");



	}


	public static void iniciarCombate() {
		System.out.println("|-------------------------|");
		System.out.println("| QUE COMIENZE EL COMBATE |");
		System.out.println("|-------------------------|");

		while(!finCombate) {

			if(pokEnt1.velocidad > pokEnt2.velocidad ) {
				//comienza entrenador 1 con su pokemon
				System.out.println("Comienza " + entrenador1.nombre + " con " + entrenador1.pokemonActual.nombre);
				System.out.println("Que movimiento utilizara " + entrenador1.pokemonActual.nombre);
				entrenador1.pokemonActual.mostrarMovimientos();

				System.out.print("Movimiento: ");
				Movimiento mov1 = entrenador1.pokemonActual.movimientos.get(teclado.nextInt() - 1);


				System.out.println();
				System.out.println("--------");
				System.out.println();

				System.out.println("Con que contratacara " + entrenador2.nombre + "?? Su pokemon es " + entrenador2.pokemonActual.nombre);
				entrenador2.pokemonActual.mostrarMovimientos();

				System.out.print("Movimiento: ");
				Movimiento mov2 = entrenador2.pokemonActual.movimientos.get(teclado.nextInt() - 1);


				System.out.println();
				Pokemon.atacar(pokEnt1, pokEnt2, mov1);
				if(pokEnt2.getVida() < 0) {
					System.out.println(" tu compañero se a debilitado...");
					entrenador1.quitarpokemon(pokEnt1);
					if(entrenador1.equipo.isEmpty()) {
						System.out.println();
						System.out.println("Perdio " + entrenador1.nombre);
						System.out.println("Gana " + entrenador2.nombre);
						break;
					} else {
						System.out.println("Cambia de compañero");
						entrenador1.cambiarPok();
						
					}
				}
				System.out.println();
				Pokemon.atacar(pokEnt2, pokEnt1, mov2);


			} else {
				//comienza entrenador 2 con su pokemon


			}


		}


	}







}
