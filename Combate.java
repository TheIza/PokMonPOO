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
	
	public static void iniciarCombate() {
		System.out.println("|------------------------|");
		System.out.println("| QUE EMPIEZE EL COMBATE |");
		System.out.println("|------------------------|");
		
		while(!finCombate) {
			
			
			
		}
		
		
	}
	
	
	
	
	
	
	
}
