package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {

        ServicioMusica appleMusic = new ServicioMusica("Apple Music");

        try {
            appleMusic.agregarCancion(new Cancion("Electronica", "David Guetta", "Fallen", "Hey mama", "1:30",
                    10000000));
            appleMusic.agregarCancion(new Cancion("Salsa", "Pepe", "Se fue", "El desamor", "5:30", 255));
            appleMusic.agregarCancion(new Cancion("Pop", "Billie Elish", "When We All Fall Asleep", "Bury a friend",
                    "hol3:30", 50000));


            appleMusic.imprimirListaCanciones(new ComparadorGenero());
            appleMusic.imprimirListaCanciones(new ComparadorAutor());
            appleMusic.imprimirListaCanciones(new ComparadorAlbum());
            appleMusic.imprimirListaCanciones(new ComparadorNombreCancion());

            //De menor duración a mayor duración
            appleMusic.imprimirListaCanciones(new ComparadorDuracion());

            //De menos visualizaciones a más visualizaciones
            appleMusic.imprimirListaCanciones(new ComparadorPopularidad());

        } catch (ParseException e) {
            System.out.println("Se ingresó una duración no válida");
        }




    }
}
