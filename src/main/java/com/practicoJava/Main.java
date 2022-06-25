package com.practicoJava;


import java.text.Collator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public boolean siVocalDaUnBoolean(char[] vocales, char letra) {
        return (new String(vocales).indexOf(letra)) >= 0;
    }


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        Scanner entrada = new Scanner(System.in);
        Main app = new Main();

        //----------EJERCICIO 1 Y 2----------
//        int n1,n2;
//        System.out.println("ingrese el primer valor");
//        n1 = entrada.nextInt();
//        System.out.println("ingrese el segundo valor");
//        n2 = entrada.nextInt();
//        System.out.println("El numero mayor es: " + Math.max(n1,n2));


        //----------EJERCICIO 3----------
//        System.out.println("ingrese un valor");
//        double radio = entrada.nextDouble();
//        int potencia = 2;
//        System.out.println(df.format(Math.PI * Math.pow(radio,potencia)));

        //----------EJERCICIO 4----------
//        System.out.println("ingrese un precio");
//        double precio = entrada.nextDouble();
//        final double IVA = precio * 0.21;
//        double total = precio + IVA;
//        System.out.println("el total es: " + total);

        //----------EJERCICIO 5----------
//        int i = 1;
//        while (i<100){
//            if(i%2 !=0){
//                System.out.println(i);
//            }
//            i++;
//        }

        //----------EJERCICIO 6----------
//        for(int i=0;i<100;i++){
//            if (i%2 !=0){
//                System.out.println(i);
//            }
//        }

        //----------EJERCICIO 7----------
//        int numero;
//        do {
//            System.out.println("ingrese un numero");
//            numero = entrada.nextInt();
//        }while (numero<0);

        //----------EJERCICIO 8----------
//        System.out.println("ingrese un dia");
//        String dia = entrada.nextLine();
//        switch (dia){
//            case "lunes":
//                System.out.println("dia laborable");
//                break;
//            case "martes":
//                System.out.println("dia laborable");
//                break;
//            case "miercoles":
//                System.out.println("dia laborable");
//                break;
//            case "jueves":
//                System.out.println("dia laborable");
//                break;
//            case "viernes":
//                System.out.println("dia laborable");
//                break;
//            default:
//                System.out.println("no se trabaja pero se estudia");
//        }
        //----------EJERCICIO 9----------
//        String texto = "La sonrisa sera la mejor arma contra la tristeza";
//        System.out.println("ingrese una frase");
//        String nuevaCadena = entrada.nextLine();
//        System.out.println(texto.replace("a","e") + ", " + nuevaCadena);
//
//        //----------EJERCICIO 10----------
//        System.out.println("ingrese una frase");
//        String texto = entrada.nextLine();
//        String nuevaCadena = texto.replaceAll(" ","");
//        System.out.println(nuevaCadena);

        //----------EJERCICIO 11----------

//        System.out.println("ingrese una frase");
//        String texto = entrada.nextLine();
//        int cont = 0;
//        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
//        for (int i = 0; i < texto.length(); i++) {
//            //tomo como parametro un arreglo y una letra. Busco dentro del arreglo con charAt si se encuentra la letra
//            if (app.siVocalDaUnBoolean(vocales, texto.charAt(i))) {
//                cont++;
//            }
//        }
//        System.out.println("la longitud de la frase es: " + texto.length() +" y la cantidad de vocales es: "+cont);


        //----------EJERCICIO 12----------

//        System.out.println("ingrese la primera palabra");
//        String palabra1 = entrada.nextLine();
//        System.out.println("ingrese una segunda palabra");
//        String palabra2 = entrada.nextLine();
//        if (palabra1.equals(palabra2)) {
//            System.out.println("son iguales");
//        } else {
//            if (palabra1.length() < palabra2.length()) {
//                System.out.println("La palabra: " + "'"+ palabra1 +"'"+ " contiene menos caracteres que la palabra: "+ "'" + palabra2 + "'");
//            } else if(palabra1.length() > palabra2.length()){
//                System.out.println("La palabra: " + "'"+ palabra1 +"'"+ " contiene mas caracteres que la palabra: "+"'" + palabra2+"'" );
//            }else{
//                System.out.println("contienen la misma cantidad de caracteres pero son diferentes");
//            }
//
//        }


        //----------EJERCICIO 13----------


        //----------EJERCICIO 14----------

        //----------Ejercicio 15----------







    }
}
