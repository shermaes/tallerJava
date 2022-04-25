package punto15.sofkau;

import java.util.Scanner;

public class Ejercicio15{
    int caso;
    Scanner sc = new Scanner(System.in);

    public void menu() {
pedirOpcion();
        while(caso!=8){

        switch (caso) {
            case 1:
                System.out.println("Se ha seleccionado un nuevo actor");
                pedirOpcion();
                break;
            case 2:
                System.out.println("Se inicializo la busqueda de un nuevo actor");
                pedirOpcion();
                break;
            case 3:
                System.out.println("Se ha eliminado el actor");
                pedirOpcion();
                break;
            case 4:
                System.out.println("Se modificara el actor");
                pedirOpcion();
                break;
            case 5:
                System.out.println("Los actores disponibles son: Juan, Maria y Jose");
                pedirOpcion();
                break;
            case 6:
                System.out.println("La pelicula de Juan es 'Juan Imposible', la pelicula de Maria es 'Ositos gominola' y al de Jose es 'El hombre invisibnle");
                pedirOpcion();
                break;
            case 7:
                System.out.println("La primera pelicula esta categorizada como A1, la segunda como B1 y la tercera A2");
                pedirOpcion();
                break;

            default :
                System.out.println("Inserte un numero entre 1 y 8");
                pedirOpcion();
                break;

        }

    }
}





    private int pedirOpcion() {

        System.out.println("Indique que quiere hacer con el numero correspondiente");
        System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
        caso = sc.nextInt();
        return caso;
    }
}

