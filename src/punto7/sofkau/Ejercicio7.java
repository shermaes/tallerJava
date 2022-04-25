package punto7.sofkau;

import java.util.Scanner;

public class Ejercicio7 {
    double numero;

    public void leerNumero() { // capturamos por teclado el valor
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor o igual que cero");
        numero = sc.nextInt();
    }

    public void comprobarNumero() {
        leerNumero(); //pedimos numero
        do { //esto es lo que haremos cada que un numero sea menor que cero
            System.out.println("Su numero es menor que cero");
            leerNumero();
        } while (numero < 0);
    }
}
