package punto5.sofkau;

public class Ejercicio5 {
 int numero;

   public boolean esPar(int numero){
       return numero%2==0;
   }
    public void mostrarNumeros(){
       int i =1;
       while(i<=100){
           if(esPar(i)==true){
               System.out.println("El numero "+i+" es par.");
           }else{
               System.out.println("El numero "+i+" es impar.");
           }
           i++;
       }
    }
}
