package punto8.sofkau;

import java.util.Scanner;

public class Ejercicio8 {
    String dia;

    public void pedirOpcion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indiquenos un dia para saber si tiene que laborar o no");
        dia = sc.nextLine();

    }

    public void confirmarDia() {
        pedirOpcion();
        //los cases estan en blanco ya que al indicar que es lunes el pasaria por todos los casos hasta llegar al viernes y leer que se tiene que trabajar
        //lo mismo hacemos para los dias de descanso
        //esto lo hacemos buscando reducir la complejidad de la clase
        switch (dia) {
            case "lunes":

            case "martes":

            case "miercoles":

            case "jueves":

            case "viernes":
                System.out.println("Hoy le toca trabajar");
                break;
            case "sabado":

            case "domingo":
                System.out.println("A descansar!");
                break;
        }
    }
}
