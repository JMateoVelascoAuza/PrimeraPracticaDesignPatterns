package Ejercicio9;

public class Roman8 extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("8")) {
            context.output = context.output + "VIII ";
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
