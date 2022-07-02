package com.ejercicio17;

public class Lavadora extends Electrodomestico {

    private int carga = 5;

    public Lavadora() {
    }

    public Lavadora(double precioVariable, double peso) {
        super(precioVariable, peso);

    }

    public Lavadora(double precioVariable, String color, char consumoEnergetico, double peso, int carga) {
        super(precioVariable, color, consumoEnergetico, peso);
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
