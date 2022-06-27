package com.ejercicio17;

import java.sql.Array;
import java.util.Arrays;

public class Electrodomestico {

    private double precioBase = 100;
    private String color = "blaco";
    private char consumoEnergetico = 'F';
    private double peso = 5;

    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
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
        return (this.peso >= 0 && this.peso <= 19) ? precioFinal += 10 :
                (this.peso >= 50 && this.peso <= 49) ? precioFinal += 80 :
                        (this.peso > 80) ? precioFinal += 100 : precioFinal;


    }


}
