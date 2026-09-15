package PokemonBattlePOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador {
	static Scanner teclado = new Scanner(System.in);

	String nombre;
	static ArrayList<Pokemon> equipo = new ArrayList<>(6);
	static Pokemon pokemonActual;

	public Entrenador(String nombre, ArrayList<Pokemon> equipo) {
		this.nombre = nombre;
		Entrenador.equipo = equipo;
	}


	public static void añadirPokemon(Pokemon pok) {

		equipo.add(pok);

	}

	public static void cambiarPok() {	

		System.out.println("  LISTADO POKEMON " + 
				"|--------0--------|");
		for(int i = 0; i < equipo.size(); i++) {
			System.out.println((i+1) + ". " + equipo.get(i));
		}

		System.out.println();
		System.out.print("A quien quieres sacar? ");
		int opcion = numValido();

		System.out.println("!!! YO TE ELIJO !!! ");
		Pokemon pokemonEscogido = equipo.get(opcion);
		System.out.println( "!!! -" + pokemonEscogido.nombre + "- !!!");
		Entrenador.pokemonActual = pokemonEscogido;
		
	}
	
	public static void mostrarEquipo(){
		
		System.out.println();
		System.out.println("- - - EQUIPO - - -");
		
		for(int i = 0; i < equipo.size(); i++) {
			System.out.println( " -" + equipo.get(i));
		}
		System.out.println();
		
	}
	
	
	public static int numValido() {
		boolean fin = false;
		// valor predeterminado de menu (saltaria el DEFAULT del switch)
		int menu = 0;
		while(!fin) {
			// recogemos la opcion por string
			String menu_str = teclado.next();
			// la pasamos a numero gracias al codigo ascii
			int menu_str1 = (int) menu_str.charAt(0);
			
			// miramos si esta entre 47 y 58 , que son los numeros 0-9 pero en ascii
			if (menu_str1 > 47 && menu_str1 < 55) {
				// volvemos a traducir si es un numero
				menu = menu_str1-48;
			} 
			
			if(menu == 0) {
				System.out.println("Opcion invalida...");
			} else {
				fin = true;
			}
							
		}
		return(menu);
		
		
		
		
	}
	
}
