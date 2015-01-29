package es.fpada;

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

    public String toString(){
        return "Nombre: " + this.nombre +
                "\nEdad: " + this.edad +
                "\nDNI: " + this.dni +
                "\nSexo: " + this.sexo +
                "\nPeso: " + this.peso +
                "\nAltura: " + this.altura;
    }
    // Constructores

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, double peso){
        // Observar el uso de this para diferenciar entre las
        // variables de instancia y los parámetros de la función.
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        // En esta ocasión utilizamos los accesores en los casos en que sea posible.
        setNombre(nombre);
        setEdad(edad);
        this.dni = dni;
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


}
