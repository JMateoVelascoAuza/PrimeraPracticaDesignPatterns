package Ejercicio9;

public class Roman1 extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")) {
            context.output = context.output + "I ";
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
