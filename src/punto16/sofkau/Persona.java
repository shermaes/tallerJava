package punto16.sofkau;

import java.util.Scanner;

public class Persona {
    private static char letraDNI;

    //atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    //constructores

    //por defecto
    public Persona() {
    }

    //todos los atributos como parametro
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //nombre, edad y sexo como parametro
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    //metodos

    private static char calcularLetra(int numeroCifras) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numeroCifras % 23;
        letraDNI = caracteres.charAt(resto);
        return letraDNI;
    }

    public int calcularIMC() {
        final int ideal = -1;
        final int porDebajo = 0;
        final int sobrePeso = 1;
        double v = peso / (Math.pow(altura, 2));
        if (v < 20) {
            System.out.println("Su peso es ideal ");
            return ideal;
        }
        if (v >= 20 && v < 25) {
            System.out.println("Su peso esta por debajo del ideal");
            return porDebajo;
        }
        System.out.println("Tiene sobre peso " );
        return sobrePeso;
    }

    public boolean esMayorDeEdad() {
        boolean m = edad > 18;
        System.out.println("Es mayor de edad? "+m);
        return m;
    }

    private char comprobarSexo() {
        if (sexo != 'F' && sexo != 'H') {
            sexo = 'H';
        }
        System.out.println(sexo);
        return sexo;
    }

    public String toString() {
        generaDNI();
        comprobarSexo();
        return nombre + " Edad: " + edad + " DNI: " + dni + " Sexo: " + sexo + " Peso: " + peso + " Altura: " + altura;
    }

    private int generarCifras() {
        int numeroCifras = (int) (10000000 + Math.random() * 90000000);
        dni = String.valueOf(numeroCifras);
        return numeroCifras;
    }

    private String generaDNI() {
        calcularLetra(generarCifras());
        dni = dni.concat(String.valueOf(letraDNI));
        return dni;
    }

    public void crearPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su nombre");
        nombre = sc.nextLine();
        System.out.println("Indique su edad");
        edad=sc.nextInt();
        System.out.println("Indique su peso");
        peso=sc.nextDouble();
        System.out.println("Indique su altura");
        altura=sc.nextDouble();
        System.out.println("Indique su sexo (F o H)");
        sexo=sc.next().charAt(0);
    }

    //setters

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


