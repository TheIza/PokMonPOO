package PokemonBattlePOO;

import java.util.ArrayList;

public class Movimiento {
	
	String nombre;
	Tipo tipo;
	int potencia;
	int precision;
	static ArrayList<Movimiento> listaMovimientos = new ArrayList<>();
	
	public Movimiento(String nombre, Tipo tipo, int potencia, int precision) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.potencia = potencia;
		this.precision = precision;
	}
	
	public static void iniciarMovimientos() {

	    Movimiento mov1 = new Movimiento("Ascuas", Tipo.FUEGO, 40, 100);
	    Movimiento mov2 = new Movimiento("Lanzallamas", Tipo.FUEGO, 90, 100);
	    Movimiento mov3 = new Movimiento("Nitrocarga", Tipo.FUEGO, 50, 100);
	    Movimiento mov4 = new Movimiento("Colmillo Igneo", Tipo.FUEGO, 65, 95);
	    Movimiento mov5 = new Movimiento("Giro Fuego", Tipo.FUEGO, 35, 100);
	    Movimiento mov6 = new Movimiento("Envite Igneo", Tipo.FUEGO, 120, 85);
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
	    
	    listaMovimientos.add(mov1);
	    listaMovimientos.add(mov2);
	    listaMovimientos.add(mov3);
	    listaMovimientos.add(mov4);
	    listaMovimientos.add(mov5);
	    listaMovimientos.add(mov6);
	    listaMovimientos.add(mov7);
	    listaMovimientos.add(mov8);
	    listaMovimientos.add(mov9);
	    listaMovimientos.add(mov10);
	    listaMovimientos.add(mov11);
	    listaMovimientos.add(mov12);
	    listaMovimientos.add(mov13);
	    listaMovimientos.add(mov14);
	    listaMovimientos.add(mov15);
	    listaMovimientos.add(mov16);
	    listaMovimientos.add(mov17);
	    listaMovimientos.add(mov18);
	    listaMovimientos.add(mov19);
	    listaMovimientos.add(mov20);
	    listaMovimientos.add(mov21);
	    listaMovimientos.add(mov22);
	    listaMovimientos.add(mov23);
	    listaMovimientos.add(mov24);
	    listaMovimientos.add(mov25);
	    listaMovimientos.add(mov26);
	    listaMovimientos.add(mov27);
	    listaMovimientos.add(mov28);
	    listaMovimientos.add(mov29);
	    listaMovimientos.add(mov30);
	  
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public static ArrayList<Movimiento> getListaMovimientos() {
		return listaMovimientos;
	}

	public static void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
		Movimiento.listaMovimientos = listaMovimientos;
	}
	
	
	
	
}
