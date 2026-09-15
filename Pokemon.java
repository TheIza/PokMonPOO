package PokemonBattlePOO;

public class Pokemon {

	
	String nombre;
	int nivel;
	int vida;
	int vidaMaxima = 120;
	int ataque;
	int defensa;
	int velocidad;
	Tipo tipo;
	
	public Pokemon(String nombre, int nivel, int vida, int ataque, int defensa, int velocidad,
			Tipo tipo) {
	
		this.nombre = nombre;
		this.nivel = nivel;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.tipo = tipo;
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




	public static void atacar(Pokemon pok1, Pokemon pok2, Movimiento mov) {
		// pok1 >ataca> pok2 Con movimientos
		
	}
	
	public static void recibirDanio(Pokemon pok) {
		// pok recibe daño pasivo por envenenamiento, fuego o otros modos
		
	}
	
	public static boolean estaVivo(Pokemon pok) {
		// comprueva vida pokemon, devuelve boolean
		
		if(pok.vida <= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void subirNivel(Pokemon pok) {
		// sube de nivel
		pok.nivel++;
	}
	
	
	
	
}
