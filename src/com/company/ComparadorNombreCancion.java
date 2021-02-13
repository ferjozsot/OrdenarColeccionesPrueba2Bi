package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparadorNombreCancion extends Filtro implements Comparator<Cancion> {

    @Override
    public int compare(Cancion cancion1, Cancion cancion2) {
        return cancion1.getNombreCancion().compareTo(cancion2.getNombreCancion());
    }

    @Override
    public void ordenar(ArrayList<Cancion> canciones) {

        Collections.sort(canciones, new ComparadorNombreCancion());
    }
}
