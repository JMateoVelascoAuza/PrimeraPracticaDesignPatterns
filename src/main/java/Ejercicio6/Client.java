package Ejercicio6;

import java.util.Locale;

public class Client {
    public static void main(String[] args) {
        String msg = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Traductor traductor = new Traductor(msg.toLowerCase());
        System.out.println("Mensaje Original: "+msg);
        System.out.println("Mensaje Gherkins: "+ traductor.traduccion());


    }

}
