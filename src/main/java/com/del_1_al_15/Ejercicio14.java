package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int numero = entrada.nextInt();
        for (int i = numero; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }

}
