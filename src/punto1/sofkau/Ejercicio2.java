package punto1.sofkau;

import java.util.Scanner;

public class Ejercicio2 {
    int x, y;

    //punto 2 - entrada por teclado
    public void mayorQueTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        x = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        y = sc.nextInt();
        if (x != y) {
            System.out.println("Sus numeros son " + x + " y " + y);
            System.out.println("El mayor de ellos es " + Math.max(x, y));
        } else {
            System.out.println("Sus numeros son iguales");
        }
    }
}
