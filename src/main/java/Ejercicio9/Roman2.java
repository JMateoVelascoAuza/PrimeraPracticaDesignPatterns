package Ejercicio9;

public class Roman2 extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("2")) {
            context.output = context.output + "II ";
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
