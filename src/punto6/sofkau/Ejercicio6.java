package punto6.sofkau;

public class Ejercicio6 {

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public void mostrarNumeros() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (esPar(i) == true) {
                System.out.println("El numero " + i + " es par.");
            } else {
                System.out.println("El numero " + i + " es impar.");
            }
        }
    }
}
