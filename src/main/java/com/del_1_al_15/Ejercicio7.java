package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        do {
            System.out.println("ingrese un numero");
            numero = entrada.nextInt();
        } while (numero > 0);
    }
}
