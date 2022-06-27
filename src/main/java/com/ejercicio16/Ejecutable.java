package com.ejercicio16;

import java.util.Scanner;

public class Ejecutable {

    public static void mensajeSegunPeso(int imc){
        if (imc == -1) System.out.println("esta por debajo el peso ideal");
        if(imc == 1) System.out.println("peso ideal");
        if(imc == 0) System.out.println("tiene sobrepeso");
    }
    public static void mensajeMayorDeEdad(boolean edad){
        if (edad) System.out.println("es mayor de edad");
        else System.out.println("es menor de edad");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        //---------------------DATOS DE LA PERSONA 1-----------------
        System.out.println("ingrese un nombre");
        String nombre = entrada.nextLine();
        System.out.println("ingrese una edad");
        int edad = entrada.nextInt();
        System.out.println("ingrese su sexo Hombre o Mujer)");
        String sexoA = entrada2.nextLine();
        char sexo = sexoA.charAt(0);
        //los numeros reales por consola se ingresan con la coma
        System.out.println("ingrese el peso");
        double peso = entrada.nextDouble();
        System.out.println("ingrese la altura");
        double altura = entrada.nextDouble();

        //--------------------INSTANCIA DE LA PERSONA 1------------------
        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);

        int imc = persona1.calcularIMC();
        mensajeSegunPeso(imc);
        mensajeMayorDeEdad(persona1.esMayorDeEdad());
        System.out.println(persona1.toString());


        //---------------------DATOS DE LA PERSONA 2-----------------
        System.out.println("ingrese un nombre");
        String nombre2 = entrada.nextLine();
        System.out.println("ingrese una edad");
        int edad2 = entrada.nextInt();
        System.out.println("ingrese un sexo Hombre O Mujer");
        String sexo2 = entrada2.nextLine();
        char sexoChar2 = sexo2.charAt(0);

        //--------------Instancia de la persona-------------------
        Persona persona2 = new Persona(nombre2,edad2,sexoChar2);
        int imc2 = persona2.calcularIMC();
        mensajeSegunPeso(imc2);
        mensajeMayorDeEdad(persona2.esMayorDeEdad());
        System.out.println(persona2.toString());


        //---------------------DATOS DE LA PERSONA 3-----------------
        Persona persona3 = new Persona();
        persona3.setNombre("Matias");
        persona3.setEdad(30);
        persona3.setSexo('H');
        persona3.setPeso(65.5);
        persona3.setAltura(1.75);

        //--------------METODOS PERSONA 3-------------------

        int imc3 = persona3.calcularIMC();
        mensajeSegunPeso(imc3);
        mensajeMayorDeEdad(persona3.esMayorDeEdad());
        System.out.println(persona3.toString());


    }
}
