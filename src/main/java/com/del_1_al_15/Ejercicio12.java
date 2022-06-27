package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadenaDeCaracteresPalabra1 = "";
        String cadenaDeCaracteresPalabra2 = "";

        System.out.println("ingrese la primera palabra");
        String palabra1 = entrada.nextLine();
        System.out.println("ingrese una segunda palabra");
        String palabra2 = entrada.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("son iguales");
        } else if (palabra1.length() <= palabra2.length()) {
            for (int i = 0; i < palabra1.length(); i++) {
                char letraP1 = palabra1.charAt(i);
                char letraP2 = palabra2.charAt(i);
                if (letraP1 == letraP2) {
                    cadenaDeCaracteresPalabra1 += " Iguales: " + letraP1;
                    cadenaDeCaracteresPalabra2 += " Iguales: " + letraP2;
                } else {
                    cadenaDeCaracteresPalabra1 += " Diferentes: " + letraP1;
                    cadenaDeCaracteresPalabra2 += " Diferentes: " + letraP2;
                }
            }
            System.out.println(cadenaDeCaracteresPalabra1);
            System.out.println(cadenaDeCaracteresPalabra2);


        } else if (palabra1.length() >= palabra2.length()) {
            for (int i = 0; i < palabra2.length(); i++) {
                char letraP1 = palabra1.charAt(i);
                char letraP2 = palabra2.charAt(i);
                if (letraP1 == letraP2) {
                    cadenaDeCaracteresPalabra1 += "Iguales: " + letraP1;
                    cadenaDeCaracteresPalabra2 += "Iguales: " + letraP2;
                } else {
                    cadenaDeCaracteresPalabra1 += "Diferentes: " + letraP1;
                    cadenaDeCaracteresPalabra2 += "Diferentes: " + letraP2;
                }
            }
            System.out.println(cadenaDeCaracteresPalabra1);
            System.out.println(cadenaDeCaracteresPalabra2);
        }
    }
}
