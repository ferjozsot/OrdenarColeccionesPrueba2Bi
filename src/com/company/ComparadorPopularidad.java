package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparadorPopularidad extends Filtro implements Comparator<Cancion> {
    @Override



    public int compare(Cancion cancion1, Cancion cancion2) {
        return cancion1.getPopularidad() - cancion2.getPopularidad();
    }

    @Override
    public void ordenar(ArrayList<Cancion> canciones) {

        Collections.sort(canciones, new ComparadorPopularidad());
    }
}
