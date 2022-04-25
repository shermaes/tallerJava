package punto9.sofkau;

import java.util.Scanner;

public class Ejercicio9 {
    String frase = "La sonrisa sera la mejor arma contra la tristeza ";
    String fraseFinal;
    public void cambiarLetra(){
        System.out.println("Su frase es "+frase);
        fraseFinal =frase.replaceAll("a","e");
        System.out.println(fraseFinal);
    }

    public void concatenandoFrase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase que le guste");
        fraseFinal = fraseFinal.concat(sc.nextLine());
        System.out.println("Su texto quedaria asi: "+fraseFinal);
    }
}
