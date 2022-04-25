package punto12.sofkau;


import java.util.Scanner;

//Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
public class Ejercicio12 {
    protected String palabra1;
    protected String palabra2;


    public void capturaPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        palabra1 = sc.nextLine();
        System.out.println("Ingrese la palabra a comparar: ");
        palabra2 = sc.nextLine();
    }

    public void compararPalabras() {
        if (palabra1.length() == palabra2.length()) {
            System.out.println("Estas palabran contienen la misma cantidad de caracteres.");
        } else {
            System.out.println("Estas palabras no tienen la misma longitud.");
            System.out.print("La primera palabra contiene " + palabra1.length() + " caracteres, en cambio la segunda palabra tiene " + palabra2.length() + " caracteres.");
        }

    }

    public void sonIguales() {
        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Estas palabras contienen los mismos caracteres.");
        } else {
            diferenciarPalabras();
        }
    }

    public void diferenciarPalabras() {
        int i = 0;
        while (i < palabra1.length()) {
            Character a = palabra1.charAt(i);
            Character b = palabra2.charAt(i);
            if (a.equals(b)) {
                System.out.println("Los caracteres en la posicion " + i + " son iguales.\n"+ a + " es igual "+ b);
            } else {
                System.out.println("Los caracteres en la posicion " + i +" difieren.\n"+ a+ " es distinto a "+b);
            }
       i++;
        }
    }}


