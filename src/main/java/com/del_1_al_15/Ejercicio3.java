package com.del_1_al_15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un valor");
        double radio = entrada.nextDouble();
        int potencia = 2;
        System.out.println(df.format(Math.PI * Math.pow(radio,potencia)));
    }
}
