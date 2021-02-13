package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparadorAutor extends Filtro implements Comparator<Cancion> {
    @Override
    public int compare(Cancion cancion1, Cancion cancion2) {
        return cancion1.getAutor().compareTo(cancion2.getAutor());
    }

    @Override
    public void ordenar(ArrayList<Cancion> canciones) {
        Collections.sort(canciones, new ComparadorAutor());
    }
}
