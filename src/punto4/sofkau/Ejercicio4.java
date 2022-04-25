package punto4.sofkau;

import java.util.Scanner;

public class Ejercicio4 {
    double precio;
    final double IVA = 0.21;
    double total;

    public void calcularPrecio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio de su articulo");
        this.precio =sc.nextFloat();
        total= precio + (IVA*precio);
        System.out.println("su iva es de "+ IVA*precio);
        System.out.println("El total a pagar es de: "+total+" pesos.");
    }

}
