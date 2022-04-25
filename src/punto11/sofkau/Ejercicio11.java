package punto11.sofkau;

import punto10.sofkau.Ejercicio10;

public class Ejercicio11 extends Ejercicio10 {
    String frase;
    int contadorA = 0;
    int contadorE = 0;
    int contadorI = 0;
    int contadorO = 0;
    int contadorU = 0;

    @Override
    public String capturarFrase() {
        frase = super.capturarFrase();
        System.out.println(frase);
        return frase;
    }

    public void indicaLongitud() {
        System.out.println("La longitud de su frase es de " + frase.length() + " caracteres.");

    }

    public void contarVocales() {
        char t; //aca contendre cada caracter de mi string
        for (int i = 0; i < frase.length(); i++) {
            t = frase.charAt(i);
            if (t == 'a')
                contadorA++;
            if (t == 'e')
                contadorE++;
            if (t == 'i')
                contadorI++;
            if (t == 'o')
                contadorO++;
            if (t == 'u')
                contadorU++;
        }
    }

    public void analizarFrase() {
        contarVocales();
        System.out.println("La vocal a aparece " + contadorA + " veces en la frase");
        System.out.println("La vocal e aparece " + contadorE + " veces en la frase");
        System.out.println("La vocal i aparece " + contadorI + " veces en la frase");
        System.out.println("La vocal o aparece " + contadorO + " veces en la frase");
        System.out.println("La vocal u aparece " + contadorU + " veces en la frase");
    }
}
