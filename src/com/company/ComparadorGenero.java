package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparadorGenero extends Filtro implements Comparator<Cancion> {
    @Override
    public int compare(Cancion cancion1, Cancion cancion2) {
        return cancion1.getGenero().compareTo(cancion2.getGenero());
    }

    @Override
    public void ordenar(ArrayList<Cancion> canciones) {
        Collections.sort(canciones, new ComparadorGenero());
    }
}
