package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparadorAlbum extends Filtro implements Comparator<Cancion> {
    @Override
    public int compare(Cancion cancion1, Cancion cancion2) {
        return cancion1.getAlbum().compareTo(cancion2.getAlbum());
    }

    @Override
    public void ordenar(ArrayList<Cancion> canciones) {
        Collections.sort(canciones, new ComparadorAlbum());
    }
}
