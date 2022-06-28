package com.ejercicio17;

import java.util.ArrayList;

public class Ejecutable {


    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);

        electrodomesticos.add(new Electrodomestico());
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Lavadora(200, "negro", 'A', 10, 35));
        electrodomesticos.add(new Lavadora(200, "negro", 'F', 20, 50));
        electrodomesticos.add(new Lavadora(250, "blanco", 'D', 50, 85));
        electrodomesticos.add(new Televisor(300, 50));
        electrodomesticos.add(new Televisor(300, "blanco", 'F', 35, 69, false));
        electrodomesticos.add(new Televisor(500, "blanco", 'A', 40, 15, true));
        int precioTv = 0;
        int precioLava = 0;
        int precioElect = 0;

        for (Electrodomestico element : electrodomesticos) {
            if (element instanceof Televisor) precioTv += element.precioFinal();
            else if (element instanceof Lavadora) precioLava += element.precioFinal();
            else precioElect += element.precioFinal();

        }
        System.out.println(electrodomesticos.get(5));
        System.out.println("Precio final de Lavadoras: "+precioLava);
        System.out.println("Precio final de las Televisiones: "+precioTv);
        System.out.println("Precio final de los Electrodomesticos: "+precioElect);
        System.out.println("Precio total es: "+(precioElect+precioTv+precioLava));


    }
}
