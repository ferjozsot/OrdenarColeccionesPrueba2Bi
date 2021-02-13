package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ServicioMusica {

    private ArrayList<Cancion> canciones = new ArrayList<Cancion>();
    private String nombreServicio;

    public ServicioMusica(String nombreServicio) {
        this.nombreServicio = nombreServicio;
        this.canciones = new ArrayList<Cancion>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void imprimirListaCanciones(Filtro filtro) {
        String nombreDelFiltro = filtro.getClass().toString().substring(28).toUpperCase();

        filtro.ordenar(canciones);
        System.out.println(nombreServicio + " tiene el placer de ordenar la lista de canciones según " + nombreDelFiltro + ":\n" + canciones);
    }


    @Override
    public String toString() {
        return nombreServicio;
    }
}
