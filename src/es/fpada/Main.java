package es.fpada;

public class Main {

    public static void main(String[] args) {
        Persona yo = new Persona("Fran Delgado", 38, "12345678A",'H',91.0,1.89);

        System.out.println(yo);
        System.out.println("IMC: " + yo.indiceMasaCorporal());
        System.out.println("Mayor de edad: " + (yo.esMayorDeEdad()?"Sí":"No"));
    }
}
