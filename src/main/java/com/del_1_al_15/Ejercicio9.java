package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("ingrese una frase");
        String nuevaCadena = entrada.nextLine();
        System.out.println(texto.replace("a", "e") + ", " + nuevaCadena);


    }
}
