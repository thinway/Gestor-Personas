package es.fpada;

import java.util.Random;

/**
 * Created by Fran Delgado on 29/1/15.
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    // Constructores

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo){
        // Observar el uso de this para diferenciar entre las
        // variables de instancia y los parámetros de la función.
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        // En esta ocasión utilizamos los accesores en los casos en que sea posible.
        setNombre(nombre);
        setEdad(edad);
        generaDNI();
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
    }

    // Accesores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                "\nEdad: " + this.edad +
                "\nDNI: " + this.dni +
                "\nSexo: " + this.sexo +
                "\nPeso: " + this.peso +
                "\nAltura: " + this.altura;
    }
    
    public double indiceMasaCorporal() {
        // Devolvemos 0 si faltan los datos peso y altura
        if (this.peso == 0.0 || this.altura == 0.0){
            return 0.0;
        }else{
            return  (peso)/Math.pow(altura, 2);
        }
    }

    public boolean esMayorDeEdad() {
        if ( this.edad >= 18 ){
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarSexo(char sexo) {
        if ( sexo == this.sexo ) {
            return true;
        } else {
            return false;
        }
    }

    // Helpers
    private void generaDNI() {
        Random rnd = new Random();

        String numDni = "";

        numDni += (int)(rnd.nextDouble() * 9 + 1);

        for (int i = 0; i < 7; i++){
            numDni += (int)(rnd.nextDouble() * 10);
        }

        numDni += calcularLetraDni(numDni);

        this.dni = numDni;
    }

    private char calcularLetraDni(String numDni) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

        return letrasDNI.charAt(Integer.parseInt(numDni) % 23);
    }
}
