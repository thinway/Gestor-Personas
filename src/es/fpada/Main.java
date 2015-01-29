package es.fpada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        double peso, altura;

        System.out.println("Introduzca el nombre: ");
        nombre = in.nextLine();
        System.out.println("Introduzca la edad: ");
        edad = in.nextInt();
        System.out.println("Introduzca el sexo: ");
        sexo = in.next().charAt(0);
        System.out.println("Introduca el peso: ");
        peso = in.nextDouble();
        System.out.println("Introduzca la altura: ");
        altura = in.nextDouble();

        Persona primeraPersona = new Persona(nombre, edad, sexo, peso, altura);
        Persona segundaPersona = new Persona(nombre, edad, sexo);
        Persona terceraPersona = new Persona();

        System.out.println("Primera Persona");
        System.out.println("===============");
        System.out.println("IMC: " + primeraPersona.indiceMasaCorporal());
        System.out.println(primeraPersona.esMayorDeEdad()?"Mayor de edad":"Menor de edad");
        System.out.println(primeraPersona);

        System.out.println("Segunda Persona");
        System.out.println("===============");
        System.out.println("IMC: " + segundaPersona.indiceMasaCorporal());
        System.out.println(segundaPersona.esMayorDeEdad()?"Mayor de edad":"Menor de edad");
        System.out.println(segundaPersona);

        System.out.println("Tercera Persona");
        System.out.println("===============");
        System.out.println("IMC: " + terceraPersona.indiceMasaCorporal());
        System.out.println(terceraPersona.esMayorDeEdad()?"Mayor de edad":"Menor de edad");
        System.out.println(terceraPersona);
    }
}
