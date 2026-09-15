package PokMonBattlePOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador {

    static Scanner teclado = new Scanner(System.in);

    String nombre;

    ArrayList<PokMon> equipo = new ArrayList<>(6);

    PokMon pokMonActual;

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public static Scanner getTeclado() {
        return teclado;
    }

    public static void setTeclado(Scanner teclado) {
        Entrenador.teclado = teclado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<PokMon> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<PokMon> equipo) {
        this.equipo = equipo;
    }

    public PokMon getPokMonActual() {
        return pokMonActual;
    }

    public void setPokActual(PokMon pokmonActual) {
        this.pokMonActual = pokmonActual;
    }

    public void añadirPokmon(PokMon pok) {

        equipo.add(pok);

        if (pokMonActual == null) {
            pokMonActual = pok;
        }
    }

    public void quitarPokmon(PokMon pok) {
        equipo.remove(pok);

        if (!equipo.isEmpty()) {
            pokMonActual = equipo.get(0);
        } else {
            pokMonActual = null;
        }
    }

    public void cambiarPok() {

        System.out.println();
        System.out.println("  LISTADO POKMON ");
        System.out.println("|--------0--------|");

        for (int i = 0; i < equipo.size(); i++) {
            System.out.println((i + 1) + ". " + equipo.get(i).getNombre());
        }

        System.out.println();

        System.out.print("A quien quieres sacar? ");

        int opcion = numValido();

        PokMon pokmonEscogido = equipo.get(opcion - 1);

        System.out.println("!!! YO TE ELIJO !!! ");
        System.out.println("!!! -" + pokmonEscogido.getNombre() + "- !!!");

        pokMonActual = pokmonEscogido;
    }

    public void mostrarEquipo() {

        System.out.println();
        System.out.println("- - - EQUIPO - - -");

        for (int i = 0; i < equipo.size(); i++) {
            System.out.println(" -" + equipo.get(i).getNombre());
        }

        System.out.println();
    }

    public static int numValido() {

        boolean fin = false;

        int menu = 0;

        while (!fin) {

            String menu_str = teclado.next();

            int menu_str1 = (int) menu_str.charAt(0);

            if (menu_str1 > 47 && menu_str1 < 55) {

                menu = menu_str1 - 48;
            }

            if (menu == 0) {

                System.out.println("Opcion invalida...");

            } else {

                fin = true;
            }
        }

        return menu;
    }
}