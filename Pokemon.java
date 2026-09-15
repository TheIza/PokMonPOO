package PokemonBattlePOO;

import java.util.ArrayList;

public class Pokemon {


	String nombre;
	int nivel = 1;
	int vida = 300;
	int vidaMaxima = 300;
	int ataque = 20;
	int defensa;
	int velocidad;
	static ArrayList<Movimiento> movimientos = new ArrayList<>(3);
	static Tipo tipo;

	public Pokemon(String nombre, Tipo tipo) {

		this.nombre = nombre;
		this.defensa = (int) (Math.random() * 30) + 1;
		this.velocidad = (int) (Math.random() * 30) + 1;
		this.tipo = tipo;
		anadirMovimientos();
	}




	/*
	 * METODOS 
	 */


	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getNivel() {
		return nivel;
	}




	public void setNivel(int nivel) {
		this.nivel = nivel;
	}




	public int getVida() {
		return vida;
	}




	public void setVida(int vida) {
		this.vida = vida;
	}




	public int getVidaMaxima() {
		return vidaMaxima;
	}




	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}




	public int getAtaque() {
		return ataque;
	}




	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}




	public int getDefensa() {
		return defensa;
	}




	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}




	public int getVelocidad() {
		return velocidad;
	}




	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}




	public Tipo getTipo() {
		return tipo;
	}




	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}







	public static void anadirMovimientos() {

		int contador = 0;

		while (contador < 3) {

			int random = (int) (Math.random() * Movimiento.listaMovimientos.size());

			Movimiento mov = Movimiento.listaMovimientos.get(random);

			if (mov.getTipo() == tipo && !movimientos.contains(mov)) {

				movimientos.add(mov);
				contador++;
			}
		}
	}


	public static void atacar(Pokemon pok1, Pokemon pok2, Movimiento mov) {
		// pok1 >ataca> pok2 Con movimientos
		System.out.println(pok1.nombre + " SE LANZA AL ATAQUE!");
		System.out.println();
		Tipo tipoPok1 = pok1.tipo;
		Tipo tipoPok2 = pok2.tipo;
		int ataque = pok1.ataque;
		int precisionRandom =  (int) (Math.random() * mov.precision) + 1;
		if (precisionRandom < mov.precision) {
		
		if(tipoPok1.equals("ELECTRICO")) {
			ataque = ataque * 2;
		} else if(tipoPok1.equals("FUEGO") && tipoPok2.equals("PLANTA")) {
			ataque = ataque * 2;
		} else if (tipoPok1.equals("PLANTA") && tipoPok2.equals("AGUA")) {
			ataque = ataque * 2;
		} else if (tipoPok1.equals("AGUA") && tipoPok2.equals("FUEGO")) {
			ataque = ataque * 2;
		}
		
		ataque = ataque + mov.potencia;
		pok2.setVida(pok2.getVida() - ataque);
		System.out.println(pok2 + " -" + pok2.getVida());
		} else {
			System.out.println();
			System.out.println(pok2.nombre + " a esquivado su ataque");
			System.out.println();
		}
		
		/*
		 * 
		 * 	FUEGO, -> PLANTA
		    AGUA, -> FUEGO
		    PLANTA, -> AGUA
		    ELECTRICO -> TODOS
		 */


		System.out.println();
	}

	public static void recibirDanio(Pokemon pok, int danio) {
		pok.setVida(pok.getVida() - danio);
		
	}
	
	public static void mostrarMovimientos(){
	
		System.out.println();
		System.out.println("- - - Movimientos - - -");
		for(int i = 0; i < movimientos.size(); i++) {
			
			System.out.println((i+1)+ ". "+ movimientos.get(i).nombre);
		}
	}

	public static boolean estaVivo(Pokemon pok) {
		// comprueva vida pokemon, devuelve boolean

		if(pok.vida <= 0) {
			return false;
		} else {
			return true;
		}
	}

	
	//Este sistema de nivel es momentaneo, se ha de arreglar
	public static void subirNivel(Pokemon pok) {
		// sube de nivel
		pok.nivel++;
	}




}
