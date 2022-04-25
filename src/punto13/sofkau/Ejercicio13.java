package punto13.sofkau;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio13 {
    //Aca usaremos las clases SimpleDate Format para el formato requerido
    //Y usaremos la Calendar para obtener la hora y la fecha
    public void darHoraFecha(){
        String horaFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(horaFecha);

    }

}
