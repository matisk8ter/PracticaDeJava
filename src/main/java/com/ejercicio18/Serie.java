package com.ejercicio18;

public class Serie implements Entregable {

    private final int NUMEOTEMPORADAS = 3;
    private final boolean ENTREGADO = false;

    private String titulo;
    private int numTemporada = NUMEOTEMPORADAS;
    private boolean entregado = ENTREGADO;
    private String genero;
    private String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;

    }

    public Serie(String titulo, int numTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporada = numTemporada;
        this.genero = genero;
        this.creador = creador;

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
