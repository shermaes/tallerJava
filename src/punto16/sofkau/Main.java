package punto16.sofkau;


public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona();
        per1.crearPersona();
        per1.calcularIMC();
        per1.esMayorDeEdad();
        System.out.println(per1);
        Persona per3 = new Persona();
        per3.setNombre("Jose");
        per3.setEdad(17);
        per3.setAltura(1.56);
        per3.setPeso(59);
        per3.setSexo('H');
        per3.calcularIMC();
        per3.esMayorDeEdad();
        System.out.println(per3);
    }


}
