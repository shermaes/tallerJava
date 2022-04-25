package punto14.sofkau;

import punto5.sofkau.Ejercicio5;

import java.util.Scanner;

public class Ejercicio14 extends Ejercicio5 {
    int numero;

    public void pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un numero por favor");
        numero = sc.nextInt();
    }

    @Override
    public void mostrarNumeros() {
        pedirNumero();
        while (numero <= 1000) {
            System.out.println(numero);
            this.numero = numero + 2;

        }
    }
}

