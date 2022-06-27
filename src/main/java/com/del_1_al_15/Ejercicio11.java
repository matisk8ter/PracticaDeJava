package com.del_1_al_15;

import java.util.Scanner;

public class Ejercicio11 {

    public boolean siVocalDaUnBoolean(char[] vocales, char letra) {
        return (new String(vocales).indexOf(letra)) >= 0;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ejercicio11 app = new Ejercicio11();

        System.out.println("ingrese una frase");
        String texto = entrada.nextLine();
        int cont = 0;
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < texto.length(); i++) {
            //tomo como parametro un arreglo y una letra. Busco dentro del arreglo con charAt si se encuentra la letra
            if (app.siVocalDaUnBoolean(vocales, texto.charAt(i))) {
                cont++;
            }
        }
        System.out.println("la longitud de la frase es: " + texto.length() + " y la cantidad de vocales es: " + cont);
    }
}
