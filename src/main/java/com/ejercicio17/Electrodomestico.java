package com.ejercicio17;

import java.util.Arrays;

public class Electrodomestico {

    private final double precioBase = 100;
    private double precioVariable;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioVariable, double peso) {
        this.precioVariable = precioVariable;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
    }

    public Electrodomestico(double precioVariable, String color, char consumoEnergetico, double peso) {
        this.precioVariable = precioVariable;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioVariable() {
        return precioVariable;
    }

    public double getPrecioBase() {
        return precioBase;
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
        char letraPorDefecto = 'F';
        return ((int) letra >= 65 && (int) letra <= 70) ? letraPorDefecto = letra : letraPorDefecto;
    }


    //------------- arreglo de colores y metodo comprobar colores-------------------
    public static String coloresDisponibles[] = {"blanco", "negro", "rojo", "azul", "gris"};

    public String comprobarColor(String color) {
        String colorPorDefecto = "blanco";
        int indice = Arrays.asList(coloresDisponibles).indexOf(color);
        return indice >= 0 ? colorPorDefecto = coloresDisponibles[indice] : colorPorDefecto;

    }


    public double precioFinal() {
        double precioFinal = this.precioBase;
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }
        if (this.peso >= 0 && this.peso <= 19) precioFinal += 10;
        if (this.peso >= 50 && this.peso <= 49) precioFinal += 80;
        if (this.peso > 80) precioFinal += 100;

        return precioFinal + this.precioVariable;

    }


}
