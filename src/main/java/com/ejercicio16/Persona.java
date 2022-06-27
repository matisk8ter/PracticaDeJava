package com.ejercicio16;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public static final int PESO_MENOR = -1;
    public static final int PESO_IDEAL = 0;
    public static final int PESO_SOBREPESO = 1;


    //constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generateDNI();
        this.peso = 0;
        this.altura = 0;
    }

    //constructor nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generateDNI();
        this.peso = 0;
        this.altura = 0;
    }

    //constructor con todos los atributos
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = this.generateDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = this.peso/(Math.pow(this.altura,2));
        if (imc<20){return PESO_MENOR;}
        if(imc>=20 && imc<=25){return PESO_IDEAL;}
        if(imc>25){return PESO_SOBREPESO;}
        return 2;
    }

    public Boolean esMayorDeEdad(){
        int mayor = this.edad;
        return mayor >= 18;
    }
    public void comprobarSexo(char sexo){
        if(sexo == 'H'){
            this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return  "\n"+
                "------INFORMACION----- "+ "\n"+
                "nombre = " + this.nombre + "\n" +
                "edad = " + this.edad + "\n"+
                "dni = " + this.DNI + "\n"+
                "sexo = " + this.sexo + "\n"+
                "peso = " + this.peso +"\n"+
                "altura = " + this.altura +
                '}';
    }


    //GENERO EL NUMERO DE 8 CIFRAS
    public int generateNumeroDNI(){
        double dni = 10000000 + Math.random() * 90000000;
        return (int)dni;
    }
    //genero una letra aleatoria partiendo de un numero de DNI
    public char generateLetra(int nmero) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = nmero%23;
        return caracteres.charAt(resto);
    }

    //genero el dni a partir del numero y la letra
    public String generateDNI(){
        int numero = generateNumeroDNI();
        String serie = String.valueOf(generateLetra(numero));
        return serie + numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
