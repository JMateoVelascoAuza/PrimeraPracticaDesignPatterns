package Ejercicio9;

public class Roman9 extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("9")) {
            context.output = context.output + "IX ";
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
