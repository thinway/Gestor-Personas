package es.fpada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Persona yo = new Persona("Homer Simpson",50, 120);

        System.out.println(yo);
        System.out.println("IMC: " + yo.indiceMasaCorporal());
        System.out.println("Mayor de edad: " + (yo.esMayorDeEdad()?"Sí":"No"));
        System.out.println("Es hombre: " + (yo.comprobarSexo('H')?"Sí":"No"));
        System.out.println("Es mujer: " + (yo.comprobarSexo('M')?"Sí":"No"));
    }
}
