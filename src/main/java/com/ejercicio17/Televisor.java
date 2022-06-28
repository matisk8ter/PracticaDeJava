package com.ejercicio17;

public class Televisor extends Electrodomestico{

    private double resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Televisor() {
    }

    public Televisor(double precioVariable, double peso) {
        super(precioVariable, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(double precioVariable, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioVariable, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    @Override
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        return this.resolucion>40 ? precioFinal += precioFinal * 0.3 : this.sintonizadorTDT == true ? precioFinal += 50: precioFinal;
    }


}
