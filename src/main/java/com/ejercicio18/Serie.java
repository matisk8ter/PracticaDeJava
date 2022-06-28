package com.ejercicio18;

public class Serie implements Entregable {

    private String titulo;
    private int numTemporada = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {
        this.numTemporada = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporada = 3;
        this.entregado = false;
    }

    public Serie(String titulo, int numTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporada = numTemporada;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporada=" + numTemporada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }


    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {

        Serie serie = (Serie) a;//casteo
        if (serie.getNumTemporada() > this.numTemporada) return 0;
        return -1;

    }
}
