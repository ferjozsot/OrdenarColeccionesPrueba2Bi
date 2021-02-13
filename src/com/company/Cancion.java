package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cancion {
    private String genero;
    private String autor;
    private String album;
    private String nombreCancion;
    private String stringDuracion;
    private int popularidad;
    private Date dateDuracion;


    public Cancion(String genero, String autor, String album, String nombreCancion, String stringDuracion,
                   int popularidad) throws ParseException {
        this.genero = genero;
        this.autor = autor;
        this.album = album;
        this.nombreCancion = nombreCancion;
        this.dateDuracion = new SimpleDateFormat("mm:ss").parse(stringDuracion);
        this.stringDuracion = new SimpleDateFormat("mm:ss").format(this.dateDuracion);
        this.popularidad = popularidad;
    }


    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlbum() {
        return album;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public Date getDuracion() {
        return dateDuracion;
    }

    public int getPopularidad() {
        return popularidad;
    }


    @Override
    public String toString() {
        return "Genero: " + genero + "\tautor: " + autor + "\tAlbum: " + album + "\tnombreCancion: " + nombreCancion +
                "\tDuracion: " + stringDuracion + "\tPopularidad: " + popularidad + "\n\n";
    }
}
