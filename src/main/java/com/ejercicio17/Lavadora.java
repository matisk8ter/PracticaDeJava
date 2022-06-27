package com.ejercicio17;

public class Lavadora extends Electrodomestico {

    private int carga = 5;

    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        return this.carga > 30 ? precioFinal += 50: precioFinal;

    }
}
