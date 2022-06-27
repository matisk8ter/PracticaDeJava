package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String dia = entrada.nextLine();
        switch (dia){
            case "lunes":
                System.out.println("dia laborable");
                break;
            case "martes":
                System.out.println("dia laborable");
                break;
            case "miercoles":
                System.out.println("dia laborable");
                break;
            case "jueves":
                System.out.println("dia laborable");
                break;
            case "viernes":
                System.out.println("dia laborable");
                break;
            default:
                System.out.println("no se trabaja pero se estudia");
        }
    }
}
