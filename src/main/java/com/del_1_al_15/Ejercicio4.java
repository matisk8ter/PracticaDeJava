package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un precio");
        double precio = entrada.nextDouble();
        double IVA = precio * 0.21;
        double total = precio + IVA;
        System.out.println("el total es: " + total);

    }
}
