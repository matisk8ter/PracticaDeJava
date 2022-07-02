package com.ejercicio17;

import java.util.Arrays;
import java.util.HashMap;

public class Electrodomestico {


    private static final double PRECIOBASE = 100;
    private static final String COLORBASE = "blanco";
    private static final char CONSUMOENERGETICOBASE = 'F';
    private static final double PESOBASE = 5;


    protected double precioVariable = PRECIOBASE;
    protected String color = COLORBASE ;
    protected char consumoEnergetico = CONSUMOENERGETICOBASE;
    protected double peso = PESOBASE;

    public Electrodomestico() {

    }

    public Electrodomestico(double precioVariable, double peso) {
        this.precioVariable = precioVariable;
        this.peso = peso;
    }

    public Electrodomestico(double precioVariable, String color, char consumoEnergetico, double peso) {
        this.precioVariable = precioVariable;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioVariable() {
        return precioVariable;
    }

    public double getPrecioBase() {
        return PRECIOBASE;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergico(char letra) {

        return ((int) letra >= 65 && (int) letra <= 70) ? letra : CONSUMOENERGETICOBASE;
    }


    //------------- arreglo de colores y metodo comprobar colores-------------------
    public static String coloresDisponibles[] = {"blanco", "negro", "rojo", "azul", "gris"};

    public String comprobarColor(String color) {
        int indice = Arrays.asList(coloresDisponibles).indexOf(color);
        return indice >= 0 ?  coloresDisponibles[indice] : COLORBASE;

    }

    public static HashMap<String,Integer> mapConsumo = new HashMap<>();
    static{
        mapConsumo.put("A",100);
        mapConsumo.put("B",80);
        mapConsumo.put("C",60);
        mapConsumo.put("D",50);
        mapConsumo.put("E",30);
        mapConsumo.put("F",10);
    }
    public double precioFinal(){
        double precioFinal = this.PRECIOBASE;
        double precioDeConsumo =  mapConsumo.get(String.valueOf(this.consumoEnergetico));

        if (this.peso >= 0 && this.peso <= 19) precioFinal += 10;
        if (this.peso >= 20 && this.peso <= 49) precioFinal += 50;
        if (this.peso >= 50 && this.peso <= 79) precioFinal += 80;
        if (this.peso > 80) precioFinal += 100;

        return precioFinal + this.precioVariable + precioDeConsumo;
    }


}
