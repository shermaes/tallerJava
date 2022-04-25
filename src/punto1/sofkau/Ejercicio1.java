package punto1.sofkau;

import java.util.Scanner;

public class Ejercicio1 {
    //variables
    int x = 85;
    int y = 85;

    //utilizando la clase Math podemos reutilizar codigo
    public void mayorQue() {
        if (x != y) {
            System.out.println("Sus numeros son " + x + " y " + y);
            System.out.println("El mayor de ellos es " + Math.max(x, y));
        } else {
            System.out.println("Sus numeros son iguales");
        }
    }
}
