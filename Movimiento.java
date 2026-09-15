
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
