package punto10.sofkau;

import java.util.Scanner;

public class Ejercicio10 {
    String frase;

    public String capturarFrase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase que le guste");
        frase = sc.nextLine();
        return frase;

    }

    public void reemplazarEspacios() {
        capturarFrase();
        System.out.println(frase.replaceAll(" ", ""));
    }
}
