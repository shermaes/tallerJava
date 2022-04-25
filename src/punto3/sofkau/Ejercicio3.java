package punto3.sofkau;

import java.util.Scanner;

public class Ejercicio3 {
    double area;
    double radio;

    public void calcularAreaCirculo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de su circulo");
        radio = Double.parseDouble(sc.next());
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area de su circulo es " + area);
    }

}
