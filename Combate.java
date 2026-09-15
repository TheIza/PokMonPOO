package PokemonBattlePOO;

public class Combate {
	
	
	Entrenador entrenador1;
	Entrenador entrenador2;
	
	Pokemon pokEnt1 = entrenador1.getPokemonActual();
	Pokemon pokEnt2 = entrenador2.getPokemonActual();
	
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
		System.out.println("|------------------------|");
		System.out.println("| QUE EMPIEZE EL COMBATE |");
		System.out.println("|------------------------|");
		
		while(!finCombate) {
			
			
			
		}
		
		
	}
	
	
	
	
	
	
	
}
