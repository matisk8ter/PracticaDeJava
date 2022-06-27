package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio1y2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2;
        System.out.println("ingrese el primer valor");
        n1 = entrada.nextInt();
        System.out.println("ingrese el segundo valor");
        n2 = entrada.nextInt();
        System.out.println("El numero mayor es: " + Math.max(n1,n2));
    }
}
