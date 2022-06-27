package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String texto = entrada.nextLine();
        String nuevaCadena = texto.replaceAll(" ", "");
        System.out.println(nuevaCadena);
    }
}
